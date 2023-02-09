package java2;

import java.io.*;

class FileToken {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("Number.txt");
            int c, s = 0;
            while ((c = f.read()) != -1) {
                // System.out.print(c + "\t");
                c = c - 48;
                if (c >= 0) {
                    System.out.print(c + "\t");
                    s = s + c;
                }
            }
            System.out.println();
            System.out.println("Sum is: " + s);
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}