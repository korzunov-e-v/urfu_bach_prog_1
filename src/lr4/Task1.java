package lr4;

public class Task1 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        String result1 = get_rect_str(height, width);
        System.out.println(result1);

//        print_rect_1(height, width);
//        print_rect_2(height, width);
    }

    // Способ 1
    public static String get_rect_str(int height, int width) {
        String rect_as_str = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rect_as_str += "+";
            }
            rect_as_str += "\n";
        }
        return rect_as_str;
    }

    // Способ 2
    public static void print_rect_2(int height, int width) {
        for (int i = 0; i < height; i++) {
            System.out.println("+".repeat(width));
        }
    }

    // Способ 3
    public static void print_rect_1(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
