package LeetCode;

// https://leetcode.com/problems/ransom-note/

public class LeetCode5 {
    public static void main(String[] args) {
        assert !canConstruct("a","b");
        assert !canConstruct("aa","ab");
        assert canConstruct("aa","aab");
        assert canConstruct("abcdef","fedcba");
        assert !canConstruct("aabbcc","aabbc");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        while (ransomNote.length() > 0) {
            int index = magazine.indexOf(ransomNote.charAt(0));
            if (index >= 0) {
                ransomNote = ransomNote.substring(1);
                magazine = magazine.substring(0, index) + magazine.substring(index+1);
            } else {
                return false;
            }
        }
        return true;
    }
}
