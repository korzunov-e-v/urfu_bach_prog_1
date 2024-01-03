package lr6;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        double result_1 = get_avg_1(array);
        System.out.println(result_1);

        double result_2 = get_avg_2(array);
        System.out.println(result_2);
    }

    public static double get_avg_1(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double get_avg_2(int[] array) {
        return Arrays.stream(array).mapToDouble(v -> v).average().orElse(Double.NaN);
    }

}
