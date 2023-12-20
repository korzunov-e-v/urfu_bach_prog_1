package lr5;

public class Task4 {
    public static void main(String[] args) {
        DataClass instance_1 = new DataClass('a', 67);
        DataClass instance_2 = new DataClass(65.1267);
        System.out.println("Created instance = new DataClass(65.1267)");
        System.out.println("instance.val_1=" + instance_2.val_1 + ", instance.val_2=" + instance_2.val_2);
    }

    public static class DataClass {
        char val_1;
        int val_2;

        DataClass(char val_1, int val_2) {
            this.val_1 = val_1;
            this.val_2 = val_2;
        }

        DataClass(double val) {
            this.val_1 = (char) (int) val;
            this.val_2 = (int) (100 * val - 100 * (int) val);
        }
    }
}
