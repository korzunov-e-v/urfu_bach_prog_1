package LeetCode;

public class LeetCode14 {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        int res = lengthOfLastWord(str);
        assert res == 4;

        str = "sss";
        res = lengthOfLastWord(str);
        assert res == 3;

    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
