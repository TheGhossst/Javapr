import java.util.Scanner;

public class Trace {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int row = r.nextInt();
        System.out.print("Enter the coloumns: ");
        int c = r.nextInt();
        int i, j, s = 0;
        int a[][] = new int[row][c];
        for (i = 0; i < row; i++) {
            for (j = 0; j < c; j++) {
                System.out.print("Enter the element a[" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < c; j++) {
                if (i == j) {
                    s = s + a[i][j];
                }
            }
        }
        System.out.println("Trace is " + s);

        r.close();
    }
}
