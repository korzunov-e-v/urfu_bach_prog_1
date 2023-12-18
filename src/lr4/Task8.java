package lr4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        text = text.toLowerCase();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        String encrypted_text = encrypt(text, key);
        System.out.println("Текст после преобразования: ");
        System.out.println(encrypted_text);


        System.out.println("Выполнить обратное преобразование? (y/n)");
        String ans;

        do {
            ans = in.nextLine(); // https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
            ans = in.nextLine();
            ans = ans.toLowerCase();
            if (ans.equals("y")) {
                String decrypted_text = decrypt(encrypted_text, key);
                System.out.println("Расшифрованый текст: ");
                System.out.println(decrypted_text);
                System.exit(0);
            } else if (ans.equals("n")) {
                System.out.println("До свидания!");
                System.exit(0);
            } else {
                System.out.println("Введите корректный ответ");
            }
        } while (!ans.equals("y") | !ans.equals("n"));
    }

    public static String encrypt(String text, int key) {
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] + key);

            if (characters[i] > 'z') {
                characters[i] -= 26;
            }
        }
        return new String(characters);
    }

    public static String decrypt(String text, int key) {
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] - key);

            if (characters[i] < 'a') {
                characters[i] += 26;
            }
        }
        return new String(characters);
    }
}
