package lr8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String sourceFile = System.getProperty("user.home") + "\\sourceFile.txt";
        String resultFile = System.getProperty("user.home") + "\\resultFile.txt";

        prepareFiles(sourceFile, resultFile);
        processFiles(sourceFile, resultFile);
    }

    public static void processFiles(String sourceFile, String resultFile) {
        try {
            File f1 = new File(sourceFile);
            File f2 = new File(resultFile);

            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            // read from source file
            rd.readUTF();
            String s = rd.readUTF();
            List<Double> doubles = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                double d = rd.readDouble();
                if (d > 0) {
                    doubles.add(d);
                }
            }

            // print result
            System.out.println("second string: " + s);
            System.out.println("doubles: " + doubles);

            // write to result file
            wr.writeUTF(s);
            for (Double d : doubles) {
                wr.writeDouble(d);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }

    public static void prepareFiles(String sourceFile, String resultFile) {
        try {
            File f1 = new File(sourceFile);
            f1.createNewFile();
            System.out.println("Полный путь исходного файла: " + f1.getAbsolutePath());

            File f2 = new File(resultFile);
            f2.createNewFile();
            System.out.println("Полный путь файла с результатом: " + f2.getAbsolutePath());

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            wr.writeUTF("First string");
            wr.writeUTF("Second string");
            wr.writeDouble(100200300);
            wr.writeDouble(-400200300);
            wr.writeDouble(-400500300);
            wr.writeDouble(400500600);
            wr.writeDouble(-700500600);
            wr.flush();
            wr.close();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
