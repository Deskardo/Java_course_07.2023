import java.util.Arrays;

class MergeSort {
    final static int[] buf = new int[100000];

    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        MergeSort(a, 0, a.length - 1);
        return a;
    }

    private static void MergeSort(int[] Array, int left, int right) { 
        // сортировка слиянием O(N*log2n)
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        MergeSort(Array, left, mid);
        MergeSort(Array, mid + 1, right);

        // слияние
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (Array[i] < Array[j]) {
                buf[k] = Array[i];
                i++;
            } else {
                buf[k] = Array[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            buf[k++] = Array[i++];
        }

        while (j <= right) {
            buf[k++] = Array[j++];

        }

        for (int q = left; q <= right; q++) {
            Array[q] = buf[q];
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer9 {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 5, 1, 6, 2, 3, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}