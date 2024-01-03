package lr6;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array_1 = {1, 2, 3, 4, 5};
        int[] array_2 = {6, 4, 2, 0};

        int[] result_1 = get_min_max(array_1);
        int[] result_2 = get_min_max(array_2);

        System.out.println(Arrays.toString(result_1));
        System.out.println(Arrays.toString(result_2));
    }

    public static int[] get_min_max(int ... nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        return new int[] {min, max};
    }

}
