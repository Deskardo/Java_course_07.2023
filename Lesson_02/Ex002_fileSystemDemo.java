package Lesson_02;
import java.io.File;

public class Ex002_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir"); // считать текущую директорию
        String pathFile = pathProject.concat("/file.txt"); // сцепить директорию и наименование файла
        File f3 = new File(pathFile); // указать, что по указанному выше пути находится файл
        System.out.println(f3.getAbsolutePath()); // вывести на печать абсолютный (полный) путь к файлу

        System.out.println(pathFile);
        File f1 = new File("file.txt"); // короткий путь при условии, что файл находится в папке с проектом
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); // полный путь.
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}