import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    private LinkedList<T> queue = new LinkedList<>(); // создаем список для хранения элементов очереди

    public void enqueue(T element) {
        queue.add(element); // добавляем элемент в конец списка
    }

    public T dequeue() {
        return queue.poll(); // возвращаем первый элемент из списка и удаляем его
    }

    public T first() {
        return queue.peek(); // возвращаем первый элемент из списка, не удаляя его
    }

    public LinkedList<T> getElements() {
        return queue; // возвращаем весь список элементов очереди
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer13 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}