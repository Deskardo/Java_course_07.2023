import java.util.Arrays;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        // mergeSort(arr);
        int average = 0;
        boolean finish;
        do {
            finish = false;
            for (int i = 0; i <= arr.length - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    finish = true;
                }
            }
        } while (finish);
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
        }
        average = average / arr.length;
        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println(
                Arrays.toString(arr) + "\nMinimum is " + min + "\nMaximum is " + max + "\nAverage is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer11 {
    public static void main(String[] args) {
        Integer[] arr;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer.analyzeNumbers(arr); // вызов статического метода класса Answer
    }
}