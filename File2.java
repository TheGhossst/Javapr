package Lab;

import java.io.*;

public class File2 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("dum.txt");
            int c;
            while ((c = f.read()) != -1)
                System.out.print((char) c);
            f.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("\ndone");
        }
    }
}
