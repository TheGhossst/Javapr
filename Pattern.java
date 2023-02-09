import java.util.Scanner;

public class Pattern {
    public static void main(String args[]) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int r = reader.nextInt();
            int i, j;
            for (i = 0; i <= r - 1; i++) {
                for (j = 0; j <= r - 1; j++) {
                    if (i == 0 || i == r - 1 || j == 0 || j == r - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

    }

}
