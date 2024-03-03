package LeetCode;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class LeetCode12 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int res = strStr(haystack, needle);
        assert res == 0;

        haystack = "leetcode";
        needle = "leeto";
        res = strStr(haystack, needle);
        assert res == -1;

        haystack = "abcd";
        needle = "df";
        res = strStr(haystack, needle);
        assert res == -1;
    }

    public static int strStr(String haystack, String needle) {
        int needleLen = needle.length();

        char[] hs = haystack.toCharArray();
        char[] nd = needle.toCharArray();

        OUTER_LOOP: for (int i = 0; i < hs.length; i++) {
            for (int j = 0; j < needleLen; j++) {
                if (j+i >= hs.length) {
                    break OUTER_LOOP;
                }
                if (hs[j+i] != nd[j]) {
                    continue OUTER_LOOP;
                }
            }
            return i;
        }
        return -1;
    }
}
