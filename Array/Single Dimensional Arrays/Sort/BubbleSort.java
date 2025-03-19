import java.util.*;

class BubbleSort {
    public static void bubbleSortAsc(int a[]) {
        int temp;
        boolean swapped;
        for (int pass = 0; pass < a.length - 1; pass++) {
            swapped=false;
            for (int curr = 0; curr < a.length - 1 - pass; curr++) {
                if (a[curr + 1] < a[curr]) {
                    temp = a[curr + 1];
                    a[curr + 1] = a[curr];
                    a[curr] = temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void bubbleSortDsc(int a[]) {
        int temp;
        // int count = 0;
        boolean swapped;
        for (int pass = 0; pass < a.length - 1; pass++) {
            swapped=false;
            for (int curr = 0; curr < a.length - 1 - pass; curr++) {
                // count++;
                if (a[curr + 1] > a[curr]) {
                    temp = a[curr + 1];
                    a[curr + 1] = a[curr];
                    a[curr] = temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
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
        bubbleSortAsc(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
