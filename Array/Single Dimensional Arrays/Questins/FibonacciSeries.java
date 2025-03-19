import java.util.*;

public class FibonacciSeries {
    public static int[] getFibonacciArray(int size) {
        int a[] = new int[size];
        try {
            a[0] = 0;
            a[1] = 1;
            for (int i = 2; i < a.length; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  the Array");
        int a[] = getFibonacciArray(sc.nextInt());
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
