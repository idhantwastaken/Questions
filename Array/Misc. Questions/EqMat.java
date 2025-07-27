import java.util.*;
public class EqMat {
    int a[][], m, n;

    static Scanner sc = new Scanner(System.in);

    EqMat(int m, int n) {
        this.m = m;
        this.n = n;

        a = new int[m][n];
    }

    void readArray() {
        System.out.println("Enter " + (m * n) + "  numebers");
        for (int[] is : a) {
            for (int i = 0; i < is.length; i++) {
                is[i] = sc.nextInt();
            }
        }
    }

    int check(EqMat P, EqMat Q) {
        for (int i = 0; i < m; i++) {
            if(Arrays.equals(P.a, Q.a)) return 0;
        }
        return 1;
    }

    void print() {
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of arraya");
        int a = sc.nextInt();
        int b = sc.nextInt();

        EqMat ob1 = new EqMat(a, b);
        EqMat ob2 = new EqMat(a, b);

        ob1.readArray(); ob2.readArray();

        System.out.println("Array 1"); ob1.print();
        System.out.println("Array 2"); ob2.print();

        if (ob1.check(ob1, ob2) == 1) System.out.println("E");
        else System.out.println("!E");
    }
}
