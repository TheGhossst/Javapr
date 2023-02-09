import java.util.Scanner;

public class Pat {
    public static void main(String args[]) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int r = reader.nextInt();
            int i, j;
            for (i = 1; i <= r; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
