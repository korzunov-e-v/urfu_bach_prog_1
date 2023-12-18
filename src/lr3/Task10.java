package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int array_size = 10;

        Integer[] random_array = make_random_array(array_size);
        System.out.println("Случайная последовательность: " + Arrays.toString(random_array));

        Integer[] sorted_array = random_array.clone();
        List<Integer> sorted_list = Arrays.asList(sorted_array);
        Collections.sort(sorted_list);
        Collections.reverse(sorted_list);
        System.out.println("Отсортированная последовательность: " + sorted_list);
    }

    public static Integer[] make_random_array(int size) {
        Random rand = new Random();
        Integer[] random_array = new Integer[size];

        for (int i = 0; i < random_array.length; i++) {
            random_array[i] = rand.nextInt();
        }
        return random_array;
    }
}
