import java.util.*;

public class Palrange {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = re.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = re.nextInt();
        re.close();
        int i;
        int n3, n4, rem = 0;
        for (i = n1; i <= n2; i++) {
            n3 = i;
            n4 = 0;
            while (n3 != 0) {
                rem = n3 % 10;
                n4 = (n3 % 100) / 10;
                n3 = n3 % 100;
                System.out.println(n3 + "" + n4);
            }
            if (rem == n4) {
                System.out.print(i + "  ");
            }
        }

    }
}
