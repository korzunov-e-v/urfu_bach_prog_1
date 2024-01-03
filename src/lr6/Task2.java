package lr6;

public class Task2 {
    public static void main(String[] args) {
        DataClass instance = new DataClass();
        instance.get_val_and_increment();
        instance.get_val_and_increment();
        instance.get_val_and_increment();
    }

    static class DataClass {
        private int val = 0;

        public void get_val_and_increment() {
            System.out.println(this.val);
            this.val++;
        }
    }
}
