import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the rows of the first matrix: ");
        int r1 = r.nextInt();
        System.out.print("Enter the coloumn of the first matrix: ");
        int c1 = r.nextInt();
        System.out.print("Enter the rows of the second matrix: ");
        int r2 = r.nextInt();
        System.out.print("Enter the coloumn of the second matrix: ");
        int c2 = r.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];
        int i, j;
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print("Enter the element a[" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = r.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix 1");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print("Enter the element b[" + (i + 1) + "][" + (j + 1) + "]: ");
                b[i][j] = r.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix 2");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                c[i][j] = 0;
            }
        }
    }
}