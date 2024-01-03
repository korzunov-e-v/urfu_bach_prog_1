package lr6;

public class Task4 {
    public static void main(String[] args) {
        get_double_factorial(6);
        get_double_factorial(7);
    }

    static void get_double_factorial(int a) {
        int ans = 1;
        for (int i = a; i > 0; i -= 2) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
