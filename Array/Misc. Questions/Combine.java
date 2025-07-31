import java.util.*;
public class Combine {
    int a[], n;
    static Scanner sc = new Scanner(System.in);

    Combine(int n){
        this.n = n;
        a = new int[n];
    }

    void inputArray() {
        System.out.println("Enter " + n + " no./s");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void mix(Combine A, Combine B) {
        for (int i = 0; i < this.n; i++) {
            if (i < A.n) this.a[i] = A.a[i];
            else this.a[i] = B.a[i - B.n];
        }
    }

    void sort() {
        int temp, x;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            x=i-1;
            while (x>=0 && temp < a[x]) {
                a[x + 1] = a[x];
                x--;
            }
            a[x+1] = temp;
        }
    }

    void disp() {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        System.out.println("Enter size");
        int n = sc.nextInt();

        Combine ob1 = new Combine(n);
        Combine ob2 = new Combine(n);
        Combine ob3 = new Combine(2*n);

        ob1.inputArray(); ob2.inputArray();
        System.out.println("Array 1: "); ob1.disp();
        System.out.println("Array 2: "); ob2.disp();
        
        ob3.mix(ob2, ob1); ob3.sort();
        System.out.println("Array 1: "); ob3.disp();

    }
}