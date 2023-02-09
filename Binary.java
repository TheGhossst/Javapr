package java2;

//Nandukrishna M B21CS1235
import java.util.Scanner;

class BinarySearch {
    int binarySearch(int arr[], int low, int high, int data) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == data)
                return mid;
            else if (arr[mid] > data)
                return binarySearch(arr, low, mid - 1, data);
            else if (arr[mid] < data)
                return binarySearch(arr, mid + 1, high, data);
        }
        return 69;
    }

    public static void main(String args[]) {
        try (Scanner r = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = r.nextInt();
            int a[] = new int[n];
            int i, j, temp;
            for (i = 0; i < n; i++) {
                System.out.print("Enter the element a[" + (i + 1) + "]: ");
                a[i] = r.nextInt();
            }
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println("The sorted Array: ");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + "\t");
            }
            System.out.println();
            System.out.print("Enter the data to be searched: ");
            int data = r.nextInt();
            r.close();
            BinarySearch ob = new BinarySearch();
            int result = ob.binarySearch(a, 0, n - 1, data);
            if (result == 69)
                System.out.println("Element not present");
            else
                System.out.println("Element found at postion " + (result + 1));
        }
    }
}
/*
 * Output
 * 
 */