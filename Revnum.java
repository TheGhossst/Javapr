package Lab.java6;

import java.util.*;
import java.io.*;

public class Revnum {
    int rev(int n) {
        int t = n, t1 = 0;
        while (t != 0) {
            t1 = t1 * 10 + t % 10;
            t = t / 10;
        }
        return t1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String f1 = args[0];
        String f2 = args[1];
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        int num;
        Revnum rn = new Revnum();
        Scanner r = new Scanner(fr);
        while (r.hasNextInt()) {
            num = r.nextInt();
            num = rn.rev(num);
            fw.write(num + " ");
        }
        r.close();
        fw.close();
        fr.close();
    }
}
