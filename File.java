package Lab;

import java.io.*;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {
        Scanner re = new Scanner(System.in);
        System.out.print("Enter the string to be written: ");
        String str = re.nextLine();
        re.close();
        FileWriter f = new FileWriter("dum.txt");
        f.write(str);
        f.close();
        FileReader fr = new FileReader("dum.txt");
        int c;
        while ((c = fr.read()) != -1)
            System.out.print((char) c);
        fr.close();

        /*
         * char c[] = new char[100];
         * fr.read(c);
         * System.out.println(c);
         */
    }
}
