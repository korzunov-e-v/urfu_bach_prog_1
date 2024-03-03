package LeetCode;

// https://leetcode.com/problems/search-insert-position/

public class LeetCode13 {
    public static void main(String[] args) {
        int[] nums;
        int target;
        int res;

        nums = new int[]{1, 3, 5, 6};
        target = 5;
        res = searchInsert(nums, target);
        assert res == 2;

        nums = new int[]{1, 3, 5, 6};
        target = 2;
        res = searchInsert(nums, target);
        assert res == 1;

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        res = searchInsert(nums, target);
        assert res == 4;
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (r != l) {
            int guess = (l + r) / 2;
            if (nums[guess] == target) {
                return guess;
            } else if (nums[guess] < target) {
                if (r - l == 1) {
                    l++;
                } else {
                    l = guess;
                }
            } else if (nums[guess] > target) {
                if (r - l == 1) {
                    r--;
                } else {
                    r = guess;
                }
            }
        }
        if (nums[r] < target) {
            return r + 1;
        } else {
            return r;
        }
    }
}
