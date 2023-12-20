package lr5;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        DataClass instance_1 = new DataClass(50);
        System.out.println("Create instance_2 = new DataClass(50, 30)");
        DataClass instance_2 = new DataClass(50, 30);
        instance_2.print_vals();
        System.out.println("instance_2.set_vals(51)");
        instance_2.set_vals(51);
        instance_2.print_vals();
        System.out.println("instance_2.set_vals(55, 20)");
        instance_2.set_vals(55, 20);
        instance_2.print_vals();
    }

    static class DataClass {
        private int min;
        private int max;

        DataClass(int a) {
            int[] vals = {a, 0};
            this.min = Arrays.stream(vals).min().getAsInt();
            this.max = Arrays.stream(vals).max().getAsInt();
        }

        DataClass(int a, int b) {
            int[] vals = {a, b};
            this.min = Arrays.stream(vals).min().getAsInt();
            this.max = Arrays.stream(vals).max().getAsInt();
        }

        public void set_vals(int a, int b) {
            int[] vals = {a, b, this.min, this.max};
            this.min = Arrays.stream(vals).min().getAsInt();
            this.max = Arrays.stream(vals).max().getAsInt();
        }

        public void set_vals(int a) {
            int[] vals = {a, this.min, this.max};
            this.min = Arrays.stream(vals).min().getAsInt();
            this.max = Arrays.stream(vals).max().getAsInt();
        }

        public void print_vals() {
            System.out.println("min: " + this.min + ", max: " + this.max);
        }
    }
}
