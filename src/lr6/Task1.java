package lr6;

public class Task1 {
    public static void main(String[] args) {
        DataClass instance = new DataClass();
        instance.set_vals('a');
        instance.print_vals();

        instance.set_vals("aaa");
        instance.print_vals();

        char[] char_var_1 = {'a', 'b', 'c'};
        instance.set_vals(char_var_1);
        instance.print_vals();

        char[] char_var_2 = {'d'};
        instance.set_vals(char_var_2);
        instance.print_vals();
    }

    static class DataClass {
        char var1;
        String var2;

        public void set_vals(char a) {
            this.var1 = a;
        }

        public void set_vals(String a) {
            this.var2 = a;
        }

        public void set_vals(char[] a) {
            if (a.length == 1) {
                this.var1 = a[0];
            } else {
                this.var2 = String.valueOf(a);
            }
        }

        public void print_vals() {
            System.out.println("char " + this.var1 + ", string: " + this.var2);
        }
    }
}
