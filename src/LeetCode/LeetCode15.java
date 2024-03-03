package LeetCode;

import java.util.Arrays;
import java.util.Objects;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] digits = {9, 9};
        int[] res = plusOne(digits);
        assert Arrays.equals(res, new int[]{1, 0, 0});

        digits = new int[]{4, 3, 2, 1};
        res = plusOne(digits);
        assert Arrays.equals(res, new int[]{4, 3, 2, 2});

        digits = new int[]{8, 9};
        res = plusOne(digits);
        assert Arrays.equals(res, new int[]{9, 0});
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    System.arraycopy(digits, 0, newDigits, 1, digits.length);
                    digits = newDigits;
                    digits[i]++;
                    continue;
                }
                digits[i - 1]++;
            } else {
                break;
            }
        }
        return digits;
    }
}
