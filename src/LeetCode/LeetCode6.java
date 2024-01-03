package LeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/

public class LeetCode6 {
    public static void main(String[] args) {
        int n = 15;
        List<String> expect = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assert fizzBuzz(n).equals(expect);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        String curr;
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                curr = "FizzBuzz";
            } else if (i % 3 == 0) {
                curr = "Fizz";
            } else if (i % 5 == 0) {
                curr = "Buzz";
            } else {
                curr = String.valueOf(i);
            }
            result.add(curr);
        }
        return result;
    }
}
