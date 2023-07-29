import java.util.Scanner;

public class Practic_1 {
    public void main(String[] args) {
        // Scanner in = new Scanner(System.in, "cp866"); // команда сканер, позволяет
        // вводить данные напрямую с клавиатуры.
        // System.out.print("Введите имя пользователя: ");
        // String line = in.nextLine();
        // Integer x = Integer.parseInt(line); // парсинг данных из ввода и перевод в
        // указанный тип данных.
        // in.close(); // после ввода данных, необходимо закрывать сканер, чтоб не есть
        // ОЗУ.
        // System.out.println(line);
        // Integer a = 10; // лучше использовать обертки, а не указание типа.
        // String word = "hi";
        // Boolean flag = true; // false
        // Integer[] mass = { 12, 51, 51, 5, 1, 52, 1 };

        // for (Integer item : mass) { // foreach позволяет выводить элементы массива,
        // по условию, пока Item находится
        // // в массиве.
        // if (item % 2 == 0) {
        // System.out.println(item);
        // } else {
        // System.out.println("не четное");
        // }
        // }

        // // for (int i = 0; i < 10; i++) { // for перебирает массив по индексам.
        // // System.out.println(mass[i]);
        // // }
        // System.out.println(a + 10);

        ///

        Scanner in = new Scanner(System.in, "cp866");
        System.out.print("Введите данные: ");

        int num = 5;
        int count = 3;
        for (int i = 1; i <= count; i++) {
            Integer number = in.nextInt();
            if (num == number) {
                System.out.println("Вы угадали осталось " + (count - i) + " попыток");
                break;
            } else if ((count - i) > 0) {
                System.out.println("Попробуйте ещё раз осталось " + (count - i) + " попыток:");
            }
        }
        System.out.print("У Вас не осталось попыток, попробуйте в другой раз.");
        in.close();

        ///

    }
}
