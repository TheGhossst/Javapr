import java.util.Scanner;

public class Fact {
    public static void main(String args[]) {
        int i, f = 1;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int a = reader.nextInt();
            for (i = 1; i <= a; i++) {
                f = f * i;
            }
            System.out.println("Factorial of " + a + " is " + f);
        }
    }
}