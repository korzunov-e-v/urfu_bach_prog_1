package LeetCode;

// https://leetcode.com/problems/longest-common-prefix/

public class LeetCode4 {
    public static void main(String[] args) {
        String[] strings_1 = {"flower", "flow", "flight"};
        String[] strings_2 = {""};
        String[] strings_3 = {"dog","racecar","car"};

        assert longestCommonPrefix(strings_1).equals("fl");
        assert longestCommonPrefix(strings_2).equals("");
        assert longestCommonPrefix(strings_3).equals("");
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = "";
        String pref = "";
        for (int i = 1; i < 200; i++) {
            for (String str : strs) {
                if (!str.startsWith(pref)) {
                    return ans;
                }
            }
            ans = pref;
            if (strs[0].length() < i) {
                return ans;
            }
            pref = strs[0].substring(0,i);
        }
        return ans;
    }
}
