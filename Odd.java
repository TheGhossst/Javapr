import java.util.Scanner;

public class Odd {
    public static void main(String args[]) {
        try (Scanner r = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = r.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " is Even");
            } else {
                System.out.println(a + " is Odd");
            }
        }
    }

}
