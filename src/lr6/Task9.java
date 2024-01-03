package lr6;


public class Task9 {
    public static void main(String[] args) {
        char[] array_1 = {'a', 'b', 'c'};
        char[] array_2 = {'a', 'b', 'c', 'd'};

        char[] result_1 = swap_elements(array_1);
        char[] result_2 = swap_elements(array_2);

        System.out.println(result_1);
        System.out.println(result_2);
    }

    public static char[] swap_elements(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char curr_1 = array[i];
            char curr_2 = array[array.length - 1 - i];
            array[i] = curr_2;
            array[array.length - 1 - i] = curr_1;
        }
        return array;
    }
}
