package lr8;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("D:\\My\\File1.txt"));
            out = new BufferedWriter(new FileWriter("D:\\My\\File2.txt"));

            int lineCount = 0; // счётчик строк
            String s;

            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
