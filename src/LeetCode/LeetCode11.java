package LeetCode;

import java.util.Arrays;

public class LeetCode11 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2,2,3};
        int k = removeElement(nums, 2);
        System.out.println("res=" + k);
        System.out.println("nums=" + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                result[i] = num;
                i++;
            }
        }
        System.arraycopy(result, 0, nums, 0, result.length);
        return i;
    }
}
