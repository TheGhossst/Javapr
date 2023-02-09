package Lab;

import java.util.Scanner;
import java.io.*;

class File3 {
    public static void main(String[] args) {
        try {

            writeFile();
            System.out.println("\n");
            readFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws IOException {
        try {
            FileReader fReader = new FileReader("test.txt");
            int c;
            while ((c = fReader.read()) != -1) {
                System.out.print((char) c);
            }
            fReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void writeFile() throws IOException {
        try {
            Scanner objScanner = new Scanner(System.in);
            System.out.print("Enter the string-");
            String str = objScanner.nextLine();
            objScanner.close();
            FileWriter fWriter = new FileWriter("test.txt");
            fWriter.write(str);
            fWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}