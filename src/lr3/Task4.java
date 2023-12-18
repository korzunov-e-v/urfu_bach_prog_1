package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num_1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num_2 = in.nextInt();

        int[] nums = {num_1, num_2};
        Arrays.sort(nums);

        int[] result_1 = make_seq_for(nums[0], nums[1]);
        int[] result_2 = make_seq_for_each(nums[0], nums[1]);
        int[] result_3 = make_seq_do_while(nums[0], nums[1]);

        System.out.println(Arrays.toString(result_1));
        System.out.println(Arrays.toString(result_2));
        System.out.println(Arrays.toString(result_3));

    }

    public static int[] make_seq_for(int min, int max) {
        int[] result = new int[max - min + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = min + i;
        }
        return result;
    }

    public static int[] make_seq_for_each(int min, int max) {
        // мне не нравится, но надо было что-то придумать с другим циклом
        int[] result = new int[max - min + 1];
        int i = 0;
        for (int num : result) {
            num = min + i;
            result[i] = num;
            i++;
        }
        return result;
    }

    public static int[] make_seq_do_while(int min, int max) {
        // мне не нравится, но надо было что-то придумать с ещё одним другим циклом
        int[] result = new int[max - min + 1];
        int i = 0;
        do {
            result[i] = min + i;
            i++;
        } while (i < result.length);
        return result;
    }
}
