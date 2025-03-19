import java.util.Arrays;

class TwoWayMerge {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 6, 8, 10 };
        int b[] = { 1, 3, 6, 7, 9, 11, 12, 14, 22, 35 };
        // int c[]={1,1,2,3,3,4,6,6,7,...,35};
        int c[] = new int[a.length + b.length];
        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] < b[p2])
                c[p3++] = a[p1++];
            else
                c[p3++] = b[p2++];
        }
        if (p1 < a.length) // a is left
            for (int i = p1; i < a.length; i++)
                c[p3++] = a[p1++];
        else if (p2 < b.length) // b is left
            for (int i = p2; i < b.length; i++)
                c[p3++] = b[p2++];

        System.out.println(Arrays.toString(c));
    }
}