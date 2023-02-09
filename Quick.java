package java2;

//Nandu Krishna M B21CS1235
import java.util.*;

public class Quick {

    int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1, temp, temp2;
        for (int j = low; j <= high - 1; j++) {
            if (a[j] < pivot) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp2 = a[high];
        a[high] = a[i + 1];
        a[i + 1] = temp2;
        return i + 1;
    }

    void quicksort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quicksort(a, low, pi - 1);
            quicksort(a, pi + 1, high);
        }
    }

    void display(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = r.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element a[" + (i + 1) + "]: ");
            a[i] = r.nextInt();
        }
        Quick q = new Quick();
        System.out.println("The array before sorting:");
        q.display(a, n);
        q.quicksort(a, 0, n - 1);
        System.out.println("\nThe array after sorting: ");
        q.display(a, n);
        r.close();

    }
}
/*
 * Output
 * Enter the size of the array: 5
 * Enter the element a[1]: 2
 * Enter the element a[2]: 1
 * Enter the element a[3]: 4
 * Enter the element a[4]: 5
 * Enter the element a[5]: 3
 * The array before sorting:
 * 2 1 4 5 3
 * The array after sorting:
 * 1 2 3 4 5
 */
