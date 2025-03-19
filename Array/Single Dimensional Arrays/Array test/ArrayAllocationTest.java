public class ArrayAllocationTest {
    public static void main(String[] args) {
        // OutOfMemoryError is thrown when the size of an array exceeds the total heap memory available
        int a[] = {1};
        int size = 100;
        int s = a[0];
        while (true) {
            System.out.println(s);
            a = new int[size];
            size *= size;
        }
    }
}
