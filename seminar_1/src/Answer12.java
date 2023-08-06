import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> reversedList = new LinkedList<>(); // создаем новый список для перевернутых элементов
        for (int i = ll.size() - 1; i >= 0; i--) { // проходим по исходному списку в обратном порядке
            reversedList.add(ll.get(i)); // добавляем элементы в перевернутый список
        }
        return reversedList; // возвращаем перевернутый список

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer12 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}
