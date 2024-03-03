package LeetCode;

import java.util.Map;
import java.util.Scanner;

// https://leetcode.com/problems/roman-to-integer/

public class LeetCode3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите римское число: ");
        String roman_num = in.nextLine();

        int result = romanToInt(roman_num);
        System.out.println(result);

    }

    public static int romanToInt(String s) {
        final Map<String, Integer> num_map = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        String s_rev = new StringBuilder(s).reverse().toString();

        int ans = 0;
        int prev = 0;
        for (int i = 0; i < s_rev.length(); i++) {
            int num = num_map.get(String.valueOf(s_rev.charAt(i)));
            if (num < prev) {
                ans -= num;
            } else {
                ans += num;
            }
            prev = num;
        }
        return ans;
    }

}
