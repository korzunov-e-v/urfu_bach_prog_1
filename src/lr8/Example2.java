package lr8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) {
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\Temp\\text.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            // С потоком связана интернет-страница
            InputStream inUrl = new URL("https://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {7,9,3,7,4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
