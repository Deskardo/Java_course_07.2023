import java.util.*;

public class practic_3 {
    static class People { // создание своего класса, в который можно добавлять разные параметры с разными
                          // типами данных
        String Name;
        Integer Age;

        People(String name, int age) { // так же можно дописать дополнительный метод, принимающий на вход в качестве
                                       // аргументов параметры класса
            Name = name;
            Age = age;
        }
    }

    public static void main(String[] args) {

        // People p1 = new People(); // создание переменных по указанному классу, можно
        // добавлять любые параметры, которые есть в классе.
        // p1.Name = "Vlad";
        // p1.Age = 30;
        // People p2 = new People();
        // p2.Name = "Ivan";
        // p2.Age = 23;

        People p1 = new People("Vlad", 30); // при использовании дополнительного метода, можно указывать значения параметров в качестве аргументов.
        People p2 = new People("Ivan", 23);

        ArrayList<People> people = new ArrayList<People>();
        people.add(p1);
        people.add(p2);
        // people.add(1, "Vasya");
        // people.set(2, "Valera");

        // people.remove(0); // удаление значения списка по индексу
        // people.remove("Valera"); // удаление значения списка по значению

        // System.out.println(people);
        // System.out.println(people.get(1));
        // for (String item : people) { // стандартный foreach для перебора всех
        // значений.
        // System.out.println("Hello, " + item);
        // }

        for (People p : people) {
            System.out.println("Hello, " + p.Name + p.Age);
        }
        // System.out.println(people.size()); // узнать размер листа, кол-во элементов
        // if (people.contains("Vlad")) { // contains позволяет проверять есть ли
        // указанный аргумент в составе листа и
        // // возвращает true или false
        // System.out.println("Hello");
        // } else {
        // System.out.println("Такого имени нет");
        // }
    }
}
