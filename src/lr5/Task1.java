package lr5;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Creating SymbolDataClass instance");
        SymbolDataClass instance = new SymbolDataClass();
        System.out.println("Setting symbol to 'A'.");
        instance.set_symbol('A');
        System.out.println("Symbol code: " + instance.get_symbol_code());
        System.out.println("Printing symbol and code");
        instance.print_symbol();
    }

    public static class SymbolDataClass {
        private char symbol;

        public void set_symbol(char val) {
            this.symbol = val;
        }

        public int get_symbol_code() {
            return this.symbol;
        }

        public void print_symbol() {
            System.out.println("Symbol: " + symbol);
            System.out.println("Code: " + (int) symbol);
        }
    }
}
