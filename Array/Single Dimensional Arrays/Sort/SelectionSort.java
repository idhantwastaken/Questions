import java.util.*;

public class SelectionSort {
    public static void selectionSortAsc(int a[]) {
        int temp, pos;
        for (int i = 0; i < a.length - 1; i++) {
            pos = i;
            for (int x = i + 1; x < a.length; x++) {
                if (a[x] < a[pos])
                    pos = x; // update position if curr element is less than the min
            }
            if (pos != i) {
                temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
        }
    }

    public static void selectionSortDesc(int a[]) {
        int temp, pos;
        for (int i = 0; i < a.length - 1; i++) {
            pos = i;
            for (int x = i + 1; x < a.length; x++) {
                if (a[x] > a[pos])
                    pos = x; // update position if curr element is more than the max
            }
            if (pos != i) {
                temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array and the Array");
        int []a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        selectionSortAsc(a);
        System.out.println(Arrays.toString(a));
        selectionSortDesc(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
