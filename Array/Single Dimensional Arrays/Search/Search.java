import java.util.*;

class Search {
    public static int linearSearch(int a[], int item) {
        for (int i = 0; i < a.length; i++) {
            if (item == a[i])
                return i;
        }
        return -1; // -1 denotes NOT FOUND
    }

    public static int binarySearch(int a[], int item) {
        int left = 0, right = a.length - 1, mid;
        while (left <= right) {
            mid=(left+right)/2;
            if(item==a[mid]) return mid;
            else if(item<a[mid]) right=mid-1;
            else left=mid+1;
        }
        return -1; // -1 denotes NOT FOUND
    }
    public static int linearSearch(String a[], String item) {
        for (int i = 0; i < a.length; i++) {
            if (item.equals(a[i]))
                return i;
        }
        return -1; // -1 denotes NOT FOUND
    }

    public static int binarySearch(String a[], String item) {
        int left = 0, right = a.length - 1, mid;
        while (left <= right) {
            mid=(left+right)/2;
            if(item.equals(a[mid])) return mid;
            else if(item.compareTo(a[mid])>0) right=mid-1;
            else left=mid+1;
        }
        return -1; // -1 denotes NOT FOUND
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array and the Array");
        int []a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
        }
        int position = linearSearch(a, 56);
        System.out.println("Element 56 found at " + position);
        Arrays.sort(a);
        position = binarySearch(a, 56);
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Element 56 found at " + position);

        String b[]={"Idhant","Veer","Vedansh"};
        position = binarySearch(b, "Vedansh");
        System.out.println("Array: " + Arrays.toString(b));
        System.out.println("Element Vedansh found at " + position);
        sc.close();

    }
}