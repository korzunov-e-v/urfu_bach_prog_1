package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String sourceFile = System.getProperty("user.home") + "\\sourceFile.txt";
        String resultFile = System.getProperty("user.home") + "\\resultFile.txt";

        processFiles(sourceFile, resultFile);
    }

    public static void processFiles(String sourceFile, String resultFile) {
        final Set<Character> soglasnie = new HashSet<>(Arrays.asList('б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м',
                'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'));

        try {
            File f1 = new File(sourceFile);
            File f2 = new File(resultFile);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f1.getAbsolutePath()),
                            StandardCharsets.UTF_8));
            PrintWriter out = new PrintWriter(f2.getAbsolutePath(), StandardCharsets.UTF_8);

            int lineCount = 0;
            String s;
            while ((s = in.readLine()) != null) {
                lineCount++;
                s = s.replaceAll("\\p{Punct}", "");
                String[] words = s.split(" ");
                List<String> accepted = new ArrayList<>();
                for (String word : words) {
                    if (soglasnie.contains(word.toLowerCase().charAt(0))) {
                        accepted.add(word);
                    }
                }
                out.println("(строка: " + lineCount + ", слов: " + accepted.size() + ") "
                        + String.join(", ", accepted));
            }
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }

}
