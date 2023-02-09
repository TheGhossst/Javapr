import java.util.Scanner;

public class Mult {
    public static void main(String args[]) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = reader.nextInt();
            int i = 0, p = 1;
            for (i = 1; i <= 10; i++) {
                p = n * i;
                System.out.println(n + " x " + i + " is " + p);
            }
        }

    }
}
