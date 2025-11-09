import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0; // счётчик корректных файлов

        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = scanner.nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            // Проверяем, существует ли файл и не является ли он папкой
            if (!fileExists || isDirectory) {
                System.out.println("Файл не найден или указан путь к папке. Попробуйте снова.");
                continue; // переходим к следующей итерации цикла
            }

            // Если всё верно
            validFileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + validFileCount);
        }
    }
}
