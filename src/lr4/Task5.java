package lr4;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int height = 5;
        int width = 3;

        System.out.println("Случайный массив: ");
        int[][] array = get_rect_array(height, width);
        print_array(array);

        System.out.println();
        System.out.println("Транспонированный массив: ");
        int[][] result = transpose_array(array);
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

    public static int[][] transpose_array(int[][] array) {
        int[][] new_array = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                new_array[j][i] = array[i][j];
            }
        }
        return new_array;
    }

    public static void print_array(int[][] array) {
        for (int[] arr_str : array) {
            System.out.println(Arrays.toString(arr_str));
        }
    }
}
