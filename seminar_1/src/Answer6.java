import java.io.*;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.*;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) throws IOException {
        boolean finish;
        do {
            finish = false;
            for (int i = 0; i <= mas.length - 2; i++) {
                if (mas[i] > mas[i + 1]) {
                    int temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    finish = true;

                }
            }
            writeLog(mas);
        } while (finish);
    }

    public static void writeLog(int[] arr) {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDate = now.format(formatter);
            String logEntry = formattedDate + " " + java.util.Arrays.toString(arr) + "\n";
            fileWriter.write(logEntry);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer6 {
    public static void main(String[] args) throws IOException {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[] { 9, 4, 8, 3, 1 }; // 
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        RandomAccessFile raf = new RandomAccessFile("log.txt", "rw");
        raf.setLength(0);
        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
