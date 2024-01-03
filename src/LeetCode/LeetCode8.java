package LeetCode;

// https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

public class LeetCode8 {
    public static void main(String[] args) {
        int[][] accounts_1 = {{1,2,3},{3,2,1}};
        assert maximumWealth(accounts_1) == 6;

        int[][] accounts_2 = {{1,5},{7,3},{3,5}};
        assert maximumWealth(accounts_2) == 10;

        int[][] accounts_3 = {{2,8,7},{7,1,3},{1,9,5}};
        assert maximumWealth(accounts_3) == 17;
    }

    public static int maximumWealth(int[][] accounts) {
        int max_total = 0;
        for (int[] account : accounts) {
            int sum_i = Arrays.stream(account).sum();
            if (sum_i > max_total) {
                max_total = sum_i;
            }
        }
        return max_total;
    }
}
