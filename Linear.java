public class Linear {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int i, e = 2, n = 7, f = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == e) {
                f = 1;
                break;
            } else {
                f = 0;
            }
        }
        if (f == 1) {
            System.out.println("Number found in position " + (i + 1));

        } else {
            System.out.println("Number not found");

        }
    }
}
