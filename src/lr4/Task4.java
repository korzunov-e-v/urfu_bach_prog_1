package lr4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        int[][] result = get_rect_array(height, width);
        print_array(result);
    }

    public static int[][] get_rect_array(int height, int width) {
        int[][] two_dim_array = new int[height][width];

        for (float i = 0; i < height; i++) {
            if (i == 0) {
                two_dim_array[(int) i][0] = 2;
                continue;
            }
            if (i == height - 1) {
                two_dim_array[(int) i][width - 1] = 2;
            }
            for (int j = 0; j < width; j++) {
                boolean must_fill = (j <= (int) Math.floor((i + 1) / (height + 1) * width));
                if (must_fill) {
                    two_dim_array[(int) i][j] = 2;
                }
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
