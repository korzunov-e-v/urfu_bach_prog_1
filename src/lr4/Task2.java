package lr4;

public class Task2 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        String result = get_triangle_string(height, width);
        System.out.println(result);
    }

    public static String get_triangle_string(int height, int width) {
        StringBuilder result = new StringBuilder();

        for (float i = 0; i < height; i++) {
            int line_length = (int) Math.floor((i + 1) / height * width);
            if (i == 0) {
                line_length = 1;
            }
            if (i == height - 1) {
                line_length = width;
            }
            result.append("+".repeat(line_length)).append('\n');
        }
        return result.toString();
    }
}
