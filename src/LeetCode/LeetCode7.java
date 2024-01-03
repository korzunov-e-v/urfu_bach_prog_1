package LeetCode;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class LeetCode7 {
    public static void main(String[] args) {
        assert numberOfSteps(14) == 6;
        assert numberOfSteps(8) == 4;
        assert numberOfSteps(123) == 12;
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps += 1;
        }
        return steps;
    }
}
