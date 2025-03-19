import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSortAsc(int a[]) {
        int temp, x;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            x=i-1;
            while (x>=0 && temp < a[x]) {
                a[x + 1] = a[x];
                x--;
            }
            a[x+1]=temp;
        }
    }
    public static void insertionSortDsc(int a[]) {
        int temp, x;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            x=i-1;
            while (x>=0 && temp > a[x]) {
                a[x + 1] = a[x];
                x--;
            }
            a[x+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array and the Array");
        int []a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
        }
        
        System.out.println("Original " + Arrays.toString(a));
        insertionSortAsc(a);
        System.out.println("Ascend " +Arrays.toString(a));
        insertionSortDsc(a);
        System.out.println("Descend " +Arrays.toString(a));
        sc.close();
    }
}
