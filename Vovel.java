import java.util.Scanner;

public class Vovel {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter alphabet:");
        char n = reader.next().charAt(0);

        if (n == 'a' || n == 'A' || n == 'e' || n == 'E' || 
            n == 'i' || n == 'I' || n == 'o' || n == 'O' || 
            n == 'u' || n == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a Vowel");
        }
    }
}
