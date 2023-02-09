package Lab;

import java.util.Scanner;
import java.io.*;

class File4 {
    public static void main(String[] args) {
        try {
            readFile();
            System.out.println("\n");
            writeFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program Execution Completed");
        }
    }

    public static void readFile() throws IOException {
        FileReader fReader = new FileReader("test1.txt");
        int c;
        while ((c = fReader.read()) != -1) {
            System.out.print((char) c);
        }
        fReader.close();
    }

    public static void writeFile() throws IOException {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter the string-");
        String str = objScanner.nextLine();
        objScanner.close();
        FileWriter fWriter = new FileWriter("test.txt");
        fWriter.write(str);
        fWriter.close();
    }
}