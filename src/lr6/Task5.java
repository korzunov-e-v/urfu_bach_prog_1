package lr6;

public class Task5 {
    public static void main(String[] args) {
        sum_of_doubles(5);
        sum_of_doubles(7);
    }

    static void sum_of_doubles(int a) {
        int ans = 0;
        for (int i = 1; i <= a; i++) {
            ans += i * i;
        }
        System.out.println(ans);
    }
}
