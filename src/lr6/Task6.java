package lr6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] first_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int num = 15;
        int[] new_array_1 = get_new_array(first_array, num);
        System.out.println(Arrays.toString(new_array_1));

        num = 10;
        int[] new_array_2 = get_new_array(first_array, num);
        System.out.println(Arrays.toString(new_array_2));

        num = 5;
        int[] new_array_3 = get_new_array(first_array, num);
        System.out.println(Arrays.toString(new_array_3));
    }

    public static int[] get_new_array(int[] array, int num) {
        int new_length = Math.min(array.length, num);
        int[] new_array = new int[new_length];
        System.arraycopy(array, 0, new_array, 0, new_length);
        return new_array;
    }

}
