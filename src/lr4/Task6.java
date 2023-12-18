package lr4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int height = 2;
        int width = 3;

        Random rand = new Random();

        System.out.println("Случайный массив: ");
        int[][] array = get_rect_array(height, width);
        print_array(array);
        System.out.println();

        int deleted_row = rand.nextInt(height);
        int deleted_col = rand.nextInt(width);

        System.out.println("Будут удалены " + deleted_row + " строка и " + deleted_col + " столбец.");

        System.out.println("Новый массив: ");
        int[][] result = cut_array(array, deleted_row, deleted_col);
        print_array(result);
    }

    public static int[][] get_rect_array(int height, int width) {
        int[][] two_dim_array = new int[height][width];
        Random rand = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                two_dim_array[i][j] = rand.nextInt(10);
            }
        }
        return two_dim_array;
    }

    public static int[][] cut_array(int[][] array, int row, int col) {
        int[][] new_array = new int[array.length - 1][array[0].length - 1];

        int i_new = 0;
        int j_new = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == row) {
                continue;
            }
            for (int j = 0; j < array[0].length; j++) {
                if (j == col) {
                    continue;
                }
                new_array[i_new][j_new] = array[i][j];
                j_new++;
            }
            i_new++;
            j_new = 0;
        }
        return new_array;
    }

    public static void print_array(int[][] array) {
        for (int[] arr_str : array) {
            System.out.println(Arrays.toString(arr_str));
        }
    }
}
