package LeetCode;

import java.util.*;

// https://leetcode.com/problems/valid-parentheses/

public class LeetCode9 {
    public static void main(String[] args) {
        assert isValid("()");
        assert isValid("()[]{}");
        assert !isValid("(]");
    }

    public static boolean isValid(String s) {
        final Map<Character, Character> brackets = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );
        Stack<Character> stack = new Stack<>();
        List<Character> openers = List.of('(', '{', '[');

        char[] chars = s.toCharArray();
        for (Character curr : chars) {
            if (openers.contains(curr)) {
                stack.add(curr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character last = stack.pop();
                Character must_be = brackets.get(curr);

                if (!last.equals(must_be)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
