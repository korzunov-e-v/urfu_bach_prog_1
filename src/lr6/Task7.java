package lr6;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        char[] first_array = {'a', 'b', 'c'};
        int[] result = get_codes(first_array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] get_codes(char[] array) {
        int[] new_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        return new_array;
    }

}
