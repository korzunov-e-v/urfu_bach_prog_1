package lr5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Creating SymbolDataClass instance");
        SymbolDataClass instance = new SymbolDataClass();
        System.out.println("Setting symbols to 'A' and 'D'.");
        instance.symbol_1 = 'A';
        instance.symbol_2 = 'D';
        System.out.println("Printing range: ");
        System.out.println(Arrays.toString(instance.get_char_range()));
    }

    public static class SymbolDataClass {
        public char symbol_1;
        public char symbol_2;

        public char[] get_char_range() {
            char[] result = new char[this.symbol_2 - this.symbol_1 + 1];
            for (int i = 0; i < result.length; i++) {
                result[i] = (char) (this.symbol_1 + i);
            }
            return result;
        }
    }
}
