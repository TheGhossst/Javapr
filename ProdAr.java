import java.util.Scanner;

public class ProdAr {
    public static void main(String args[]) {
        try (Scanner r = new Scanner(System.in)) {
            System.out.print("Enter a limit: ");
            int n = r.nextInt();
            int a[] = new int[n];
            int i, p = 1;
            for (i = 0; i < n; i++) {
                System.out.print("Enter element a[" + (i + 1) + "]: ");
                a[i] = r.nextInt();
            }
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            for (i = 0; i < n; i++) {
                p = p * a[i];
            }
            System.out.println();
            System.out.println("The Product of elements in the array is " + p);
            r.close();
        }
    }
}