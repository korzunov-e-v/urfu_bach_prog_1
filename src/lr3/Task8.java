package lr3;

import java.util.Arrays;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        final int array_size = 10;

        Character[] result_as_array = make_seq(array_size);
        System.out.println("Последовательность: " + Arrays.toString(result_as_array));
    }

    public static Character[] make_seq(int size) {
        final int pos_1 = 65; // char number for A
        final int pos_2 = 90; // char number for Z
        final Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U', 'Y');

        Character[] result = new Character[size];
        int i = 0;
        int curr_char_as_int = pos_1;
        while (i < size) {
            if (curr_char_as_int > pos_2) {
                curr_char_as_int -= (pos_2 - pos_1 + 1);
            }
            Character curr_char = (Character) (char) curr_char_as_int;
            if (!vowels.contains(curr_char)) {
                result[i] = curr_char;
                i++;
            }
            curr_char_as_int++;
        }
        return result;
    }
}
