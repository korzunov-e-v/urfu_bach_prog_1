package LeetCode;

import java.util.Scanner;

// https://leetcode.com/problems/palindrome-number/

public class LeetCode2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();

        boolean num_is_palindrome = isPalindrome(num);
        if (num_is_palindrome) {
            System.out.println("Число - палиндром");
        } else {
            System.out.println("Число - не палиндром");
        }
    }

    public static boolean isPalindrome(int x) {
        String num_as_str = Integer.toString(x);
        String reverse_num_as_str = new StringBuilder(num_as_str).reverse().toString();

        return num_as_str.equals(reverse_num_as_str);
    }
}
