import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.*;

class Answer5 {
  public static StringBuilder answer(String QUERY, String PARAMS) {
    // Напишите свое решение ниже

    String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
    String[] params = paramsNew.split(",");
    StringBuilder stringBuilder = new StringBuilder(QUERY);

    for (int i = 0; i < params.length; i++) {
      String[] elements = params[i].replace('"', ' ').split(":");
      if (!"null".equals(elements[1].trim())) {
        stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
        if (i < params.length - 2)
          stringBuilder.append(" and ");
      }
    }
    return stringBuilder;

    // String line = PARAMS.replace("{", "").replace("}", "").replace("\"", "");
    // StringBuilder result = new StringBuilder(QUERY);

    // String[] arr = line.split(",");
    // for (int i = 0; i < arr.length; i++) {
    // String [] arr2 = arr[i].split(":");
    // if((arr2[1].equals("null") || arr2[1].equals("null ")) == false){
    // if(i != 0){
    // result.append(" and");
    // result.append(arr2[0]);
    // result.append("=");
    // result.append("'");
    // result.append(arr2[1]);
    // result.append("'");
    // }else{
    // result.append(arr2[0]);
    // result.append("=");
    // result.append("'");
    // result.append(arr2[1]);
    // result.append("'");
    // }

    // }
    // }

    // return result;
  }

  // select * from students where name='Ivanov' and country='Russia' and
  // city='Moscow'
  // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
  public static void main(String[] args) {
    String QUERY = "";
    String PARAMS = "";

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      QUERY = "select * from students where ";
      PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    } else {
      QUERY = args[0];
      PARAMS = args[1];
    }

    Answer5 ans = new Answer5();
    System.out.println(ans.answer(QUERY, PARAMS));
  }
}
