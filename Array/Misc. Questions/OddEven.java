import java.util.*;
public class OddEven {
    int a[], m;
    static Scanner sc = new Scanner(System.in);
    OddEven(int mm){
        m = mm;
        a = new int[m];
    }

    void readarray() {
        System.out.println("Enter " + m + "no./s");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
    }

    OddEven arrange(OddEven A, OddEven B) {
        OddEven R = new OddEven(A.m + B.m);
        int i = 0, j = 0, k = 0;
        while (i < A.m || j < B.m) {
            if (i < A.m && A.a[i] % 2 == 1) {
                R.a[k++] = A.a[i++];
            } else i++;

            if (i > A.m && j < B.m && B.a[j] % 2 == 1) {
                R.a[k++] = B.a[j++];
            } else if (i > A.m) j++;
        }
        i = j = 0;
        while (i < A.m || j < B.m) {
            if (i < A.m && A.a[i] % 2 == 0) {
                R.a[k++] = A.a[i++];
            } else i++;
            
            if (i > A.m && j < B.m && B.a[j] % 2 == 0) {
                R.a[k++] = B.a[j++];
            } else if (i > A.m) j++;
        }

        return R;
    }

    void display() {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of Array 1");
        n = sc.nextInt();

        OddEven ob1 = new OddEven(n);
        ob1.readarray();

        System.out.println("Enter the size of Array 2");
        n = sc.nextInt();

        OddEven ob2 = new OddEven(n);
        ob2.readarray();

        System.out.print("Array 1: "); ob1.display();
        System.out.print("Array 2: "); ob2.display();

        OddEven ob3 = ob1.arrange(ob1, ob2);

        System.out.println("Combined Array"); ob3.display();

    }
}