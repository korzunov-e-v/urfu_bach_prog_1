package lr5;

public class Task5 {
    public static void main(String[] args) {
        DataClass instance_1 = new DataClass(67);
        DataClass instance_2 = new DataClass();

        System.out.println(instance_2.get_val());

        instance_1.set_val();
        System.out.println(instance_1.get_val());
        instance_1.set_val(10);
        System.out.println(instance_1.get_val());
        instance_1.set_val(100);
        System.out.println(instance_1.get_val());
        instance_1.set_val(1000);
        System.out.println(instance_1.get_val());
    }

    static class DataClass {
        private int val;

        DataClass(int val) {
            this.val = Math.min(val, 100);
        }

        DataClass() {
            this.val = 0;
        }

        public void set_val(int val) {
            this.val = Math.min(val, 100);
        }

        public void set_val() {
            this.val = 0;
        }

        public int get_val() {
            return this.val;
        }
    }
}
