package java2;

import java.util.*;
import java.io.*;

class Tokenizer {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("inpo.txt");
            int c, s = 0;
            String i = "";
            while ((c = f.read()) != -1) {
                i = i + (char) c;
                i = i + " ";
            }
            f.close();
            System.out.println(i);
            StringTokenizer st = new StringTokenizer(i, " ");
            System.out.println("The Integers Are:");
            String sr = "";
            while (st.hasMoreTokens()) {
                sr = st.nextToken();
                System.out.println(sr);
                try {
                    s = s + Integer.parseInt(sr);
                } catch (Exception e) {
                    System.out.println("......");
                }
            }
            System.out.println("Sum is: " + s);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } finally {

            System.out.println("Done");
        }
    }

}
/*
 * Output
 * 1
 * 2
 * 3
 * 4
 * 5
 * The Integers Are:
 * 12345Sum is: 15
 * Done
 */