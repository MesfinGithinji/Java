public class Pattern {
    public static void main(String[] args) {
        String output = printPattern(5);
        System.out.println(output);
    }

    static String printPattern(int rows) {
        StringBuilder result = new StringBuilder();

        for (int i = rows; i >= 1; i--) {
            // Add spaces before each row
            for (int j = 1; j <= (rows - i) * 2; j++) {
                result.append(" ");
            }

            // Add stars to the row
            for (int k = 1; k <= i; k++) {
                result.append("* ");
            }

            // Move to the next line after each row
            result.append("\n");
        }

        return result.toString();
    }
}

