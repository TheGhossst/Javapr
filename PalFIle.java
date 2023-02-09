package Lab;

import java.io.*;
import java.util.*;

public class PalFIle {
    void pal(int n) {
        // System.out.println(n);
        int temp = n, sum = 0;

        while (temp != 0) {
            sum = sum * 10 + temp % 10;
            temp = temp / 10;
        }
        // System.out.println(sum);
        if (sum == n)
            System.out.println(n + " is pallindrome");
        else
            System.out.println(n + " is Not pallindrome");
    }

    public static void main(String[] args) throws IOException {
        try {
            PalFIle p = new PalFIle();
            Scanner r = new Scanner(System.in);
            System.out.print("Enter no of number: ");
            int m = r.nextInt();
            String str = "", str1 = "";
            FileWriter fw = new FileWriter("down.txt");
            for (int i = 0; i < m; i++) {
                System.out.print("Enter a number: ");
                int n = r.nextInt();
                str = String.valueOf(n);
                fw.write(str + " ");
            }
            fw.close();
            r.close();
            FileReader fr = new FileReader("down.txt");
            int c, num = 0;
            // String str1 = "";
            while ((c = fr.read()) != -1) {
                str1 += (char) c;
            }
            fr.close();
            // System.out.println(str1);
            // System.out.println(str1.charAt(0));
            StringTokenizer st = new StringTokenizer(str1, " ");
            while (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
                p.pal(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("lol");
        }
    }
}
