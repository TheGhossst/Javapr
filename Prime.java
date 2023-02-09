import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = reader.nextInt();
            int i = 2, f = 0;
            if (a == 0 || a == 1) {
                System.out.println(a + " Is Not Prime Nor Composite");
            } else {
                for (i = 2; i < a; i++) {
                    if (a % i == 0) {
                        f = 1;
                        break;
                    } else {
                        f = 2;
                    }
                }
                if (f == 2) {
                    System.out.println(a + " Is Prime");
                } else {
                    System.out.println(a + " Is Not Prime");
                }
            }
        }
    }
}
