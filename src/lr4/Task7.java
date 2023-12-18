package lr4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int height = 8;
        int width = 10;

        System.out.println("Итоговый массив (заполнялся начиная с 0): ");
        int[][] array = get_snake_array(height, width);
        print_array(array);
    }

    public static int[][] get_snake_array(int height, int width) {
        int[][] array = new int[height][width];

        int num = 0;
        int done_strs = 0;
        int done_cols = 0;
        while (done_strs < height & done_cols < width) {
//          fill left to right
            for (int i = 0; i < (width - done_cols); i++) {
                array[done_strs][i] = num;
                num++;
            }
            done_strs++;

//          fill down to up
            for (int i = height - 1; i > done_strs - 1; i--) {
                array[i][width - 1 - done_cols] = num;
                num++;
            }
            done_cols++;
        }
        return array;
    }

    public static void print_array(int[][] array) {
        for (int[] arr_str : array) {
            System.out.println(Arrays.toString(arr_str));
        }
    }
}
