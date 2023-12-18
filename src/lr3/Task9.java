package lr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int array_size = 10;

        int[] random_array = make_random_array(array_size);
        System.out.println("Случайная последовательность: " + Arrays.toString(random_array));

        Object[] result = find_min_indexes(random_array);
        System.out.println("Минимум: " + result[0]);
        System.out.println("Индексы: " + result[1]);
    }

    public static int[] make_random_array(int size) {
        Random rand = new Random();
        int[] random_array = new int[size];

        for (int i = 0; i < random_array.length; i++) {
            random_array[i] = rand.nextInt();
        }
        return random_array;
    }

    public static Object[] find_min_indexes(int[] array) {
        List<Integer> indexes = new ArrayList<>();

        int min = Arrays.stream(array).min().getAsInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexes.add(i);
            }
        }
        return new Object[]{min, indexes};
    }
}
