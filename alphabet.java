public class alphabet {
    public static void main(String[] args) {
        // One loop for 52 iterations (26 capitals + 26 small)
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                // Print capital letters
                System.out.print((char)('A' + i) + " ");
                continue; // skip to next iteration
            }
            if (i == 26) {
                // move to next line after capital letters
                System.out.println();
            }
            // Print small letters
            System.out.print((char)('a' + (i - 26)) + " ");
        }
    }
}