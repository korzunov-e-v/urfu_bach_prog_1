package lr4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        int[][] result = get_rect_array(height, width);
        print_array(result);
    }

    public static int[][] get_rect_array(int height, int width) {
        int[][] two_dim_array = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                two_dim_array[i][j] = 2;
            }
        }
        return two_dim_array;
    }

    public static void print_array(int[][] array) {
        for (int[] arr_str : array) {
            System.out.println(Arrays.toString(arr_str));
        }
    }
}
