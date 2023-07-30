import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> Arr = new ArrayList<Integer>(Arrays.asList(arr));
        Arr.removeIf(n -> n % 2 == 0);
        Integer[] a = Arr.toArray(new Integer[0]);
        System.out.println(Arrays.toString(a));

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer10 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { 2, 4, 6, 8, 9, 10 }; // 2, 4, 6, 8, 9, 10 1, 2, 3, 4, 5, 6, 7, 8, 9
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}