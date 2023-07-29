import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Practic_2 {

    public static void WriteScan() {
        Scanner in = new Scanner(System.in, "cp866");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Note1.txt"))) {
            System.out.println("Для начала работы с программой введите 1, после записи введите 0");
            while (true) {
                String line = in.nextLine();
                if (line == "1") {
                    while (line != "0") {
                        line = in.nextLine();
                        bw.write("\n" + line);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void WriteFile(ArrayList<String> words) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Note1.txt", false))) { // при добавлении false в
                                                                                           // аргументы список не
                                                                                           // перезаписывается
            bw.write("Hello World");
            for (String item : words) {
                bw.append("\n");
                bw.append(item);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<String> ReadFile() {
        ArrayList<String> words = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("Note1.txt"))) {
            // int c; // для посимвольного чтения
            String c; // построчное чтение
            // while ((c = br.read()) != -1) { // для посимвольного чтения
            while ((c = br.readLine()) != null) { // построчное чтение
                words.add(c);
                // System.out.print((char)c); // для посимвольного чтения
                // System.out.println(c); // построчное чтение
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return words;
    }

    public void main() {
        // ArrayList<String> words = ReadFile();
        // System.out.println(words);
        // words.set(1, "Hi");
        // words.remove(2);
        // System.out.println(words);
        // WriteFile(words);
        WriteScan();
    }
}
