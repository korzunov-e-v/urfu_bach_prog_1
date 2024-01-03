package lr6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        DataClass instance = new DataClass();

        int[] val_1 = {1};
        instance.get_min(val_1);
        instance.get_max(val_1);
        instance.get_avg(val_1);

        int[] val_2 = {1, 2, 3};
        instance.get_min(val_2);
        instance.get_max(val_2);
        instance.get_avg(val_2);
    }

    static class DataClass {

        public void get_min(int ... ints) {
            int ans = Arrays.stream(ints).min().getAsInt();
            System.out.println(ans);
        }

        public void get_max(int ... ints) {
            int ans = Arrays.stream(ints).max().getAsInt();
            System.out.println(ans);
        }

        public void get_avg(int ... ints) {
            Double ans = Arrays.stream(ints).average().getAsDouble();
            System.out.println(ans);
        }
    }
}
