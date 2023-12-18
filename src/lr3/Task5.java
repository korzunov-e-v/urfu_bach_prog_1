package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество суммируемых чисел (число больше нуля): ");
        int num = in.nextInt();

        int[] result_seq = make_seq(num);
        System.out.println("Последовательность: " + Arrays.toString(result_seq));

        int sum_of_array = sum_array(result_seq);
        System.out.println("Сумма последовательности: " + sum_of_array);
    }

    public static int[] make_seq(int count) {
        int[] result = new int[count];
        int i = 0;
        int curr_num = 0;
        do {
            boolean cond_1 = (curr_num % 5 == 2);
            boolean cond_2 = (curr_num % 3 == 1);
            if (cond_1 & cond_2) {
                result[i] = curr_num;
                i++;
            }
            curr_num++;
        } while (i < count);

        return result;
    }

    public static int sum_array(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

}
