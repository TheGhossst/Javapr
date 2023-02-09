
//Nandu Krishna M B21CS1235
//Exp 1C Matrix Multiplication
import java.util.Scanner;

public class Mul {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the rows of first matrix: ");
        int r1 = r.nextInt();
        System.out.print("Enter the coloumn of first matrix: ");
        int c1 = r.nextInt();
        System.out.print("Enter the rows of second matrix: ");
        int r2 = r.nextInt();
        System.out.print("Enter the coloumn of second matrix: ");
        int c2 = r.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int p[][] = new int[r1][c2];
        int i, j;
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print("Enter the element a[" + (i + 1) + "][" + (j + 1 + "]: "));
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("The First matrix is: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print("Enter the element b[" + (i + 1) + "][" + (j + 1 + "]: "));
                b[i][j] = r.nextInt();
            }
        }
        System.out.println("The Second matrix is: ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                p[i][j] = 0;
            }
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    p[i][j] = p[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The Product matrix is: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
        r.close();
    }
}
/*
 * Output
 * ...........
 * Enter the rows of first matrix: 2
 * Enter the coloumn of first matrix: 2
 * Enter the rows of second matrix: 2
 * Enter the coloumn of second matrix: 2
 * Enter the element a[1][1]: 1
 * Enter the element a[1][2]: 2
 * Enter the element a[2][1]: 3
 * Enter the element a[2][2]: 4
 * The First matrix is:
 * 1 2
 * 3 4
 * 
 * Enter the element b[1][1]: 4
 * Enter the element b[1][2]: 3
 * Enter the element b[2][1]: 2
 * Enter the element b[2][2]: 1
 * The Second matrix is:
 * 4 3
 * 2 1
 * The Product matrix is:
 * 8 5
 * 20 13
 */