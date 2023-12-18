package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        final int array_size = 10;

        Character[] result_as_array = make_seq(array_size);
        System.out.println("Последовательность: " + Arrays.toString(result_as_array));

        List<Character> result_rev_as_list = Arrays.asList(result_as_array);
        Collections.reverse(result_rev_as_list);
        System.out.println("Последовательность инвертированная: " + result_rev_as_list);
    }

    public static Character[] make_seq(int size) {
        final int pos_1 = 97; // char number for a
        final int pos_2 = 122; // char number for z

        Character[] result = new Character[size];
        int i = 0;
        int curr_char_as_int = pos_1;
        while (i < size) {
            if (curr_char_as_int > pos_2) {
                curr_char_as_int -= (pos_2 - pos_1 + 1);
            }
            result[i] = (Character) (char) curr_char_as_int;
            curr_char_as_int += 2;
            i++;
        }
        return result;
    }
}
