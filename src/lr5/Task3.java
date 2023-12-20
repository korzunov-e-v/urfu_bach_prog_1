package lr5;

public class Task3 {
    public static void main(String[] args) {
        DataClass instance_1 = new DataClass(1, 2);
        DataClass instance_2 = new DataClass(1);
        DataClass instance_3 = new DataClass();
    }

    public static class DataClass {
        int val_1;
        int val_2;

        public DataClass(int val_1, int val_2) {
            this.val_1 = val_1;
            this.val_2 = val_2;
        }

        public DataClass(int val_1) {
            this.val_1 = val_1;
        }

        public DataClass() {
        }
    }
}
