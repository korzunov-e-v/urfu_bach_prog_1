package lr2;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/two-sum/

public class LeetCode1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив чисел (nums) через пробел: ");

        String nums_str = in.nextLine();
        String[] nums_as_array_of_str = nums_str.split(" ");
        int[] nums = Arrays.stream(nums_as_array_of_str).mapToInt(Integer::parseInt).toArray();

        System.out.println("Введите искомую сумму (target): ");
        int target = in.nextInt();

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int b = nums[j];
                if (a+b==target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
