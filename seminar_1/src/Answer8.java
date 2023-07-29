import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Calculator {

    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        Integer result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else {
            System.out.println("Некорректный оператор: 'оператор'");
        }
        writeLog(op, a, b, result);
        return result;

    }

    public static void writeLog(char op, int a, int b, int result) {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDate = now.format(formatter);
            String logEntry = formattedDate + " User entered the first operand = " + a + "\n" +
                    formattedDate + " User entered the operation = " + op + "\n" +
                    formattedDate + " User entered the second operand = " + b + "\n" +
                    formattedDate + " Result is " + result + "\n";
            fileWriter.write(logEntry);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer8 {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        clearLogFile();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearLogFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}