import java.util.Scanner;

public class SumArray {
    public static void main(String args[]) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a limit: ");
            int n = reader.nextInt();
            int a[] = new int[n];
            int i;
            for (i = 0; i < n; i++) {
                System.out.print("Enter element a[" + (i + 1) + "]: ");
                a[i] = reader.nextInt();
            }
            System.out.println("The Elements Of The Array Are: ");
            System.out.println();
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            int s = 0;
            for (i = 0; i < n; i++) {
                s = s + a[i];
            }
            System.out.println();
            System.out.println("The Sum Of Elements In The Array Is " + s);
        }

    }
}