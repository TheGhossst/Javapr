package java2;

import java.util.*;

public class Tokens {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("hello world", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        // System.out.println(str);
    }
}
