package LeetCode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Arrays;

public class LeetCode10 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2,2,3};
        int k = removeDuplicates(nums);
        System.out.println("res=" + k);
        System.out.println("nums=" + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int[] result = new int[nums.length];
        int last = -101;
        int i = 0;
        for (int num : nums) {
            if (num > last) {
                result[i] = num;
                last = num;
                i++;
            }
        }
        System.arraycopy(result, 0, nums, 0, result.length);
        return i;
    }
}
