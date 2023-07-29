class Answer {
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        String line = JSON
                           .replace("}", "")
                           .replaceAll("\"", "")
                           .replace("[", "")
                           .replace("]", "");
        String [] elements = line.split("\\{");
        StringBuilder result = new StringBuilder("");
        String [] listName = {ELEMENT1, ELEMENT2, ELEMENT3};
        for (int i = 1; i < elements.length; i++) {
            String [] arrayData = elements[i].split(",");
            result.append("\n");
            for (int j = 0; j < arrayData.length; j++) {
                String[] arrData = arrayData[j].split(":");
                result.append(listName[j]).append(arrData[1]);                
            }
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer7 {
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            ELEMENT1 = "Студент ";
            ELEMENT2 = " получил ";
            ELEMENT3 = " по предмету ";
        } else {
            JSON = args[0];
            ELEMENT1 = args[1];
            ELEMENT2 = args[2];
            ELEMENT3 = args[3];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3));
    }
}