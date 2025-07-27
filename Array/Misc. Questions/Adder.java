import java.util.*;
public class Adder {
    int a[] = new int[2];

    static Scanner sc = new Scanner(System.in);

    Adder() {a[0] = 0; a[1] = 0;}

    void readTime() {
        System.out.println("Enter time in HH/MM");
        for (int i = 0; i < 2; i++) {
            a[i] = sc.nextInt();
        }
    }

    void add(Adder X, Adder Y) {
        // this.a[0] = X.a[0] + Y.a[0];
        // this.a[1] = X.a[1] + Y.a[1];

        this.a[0] = (X.a[0] + Y.a[0]) + ((X.a[1] + Y.a[1]) / 60);
        this.a[1] = (X.a[1] + Y.a[1]) % 60;
    }

    void disp() {
        System.out.println(a[0] + ":" + a[1]);
    }

    public static void main(String[] args) {
        Adder ob1 = new Adder();
        Adder ob2 = new Adder();

        ob1.readTime(); ob2.readTime();
        System.out.print("Time 1: "); ob1.disp();
        System.out.print("Time 2: "); ob2.disp();
        System.out.print("Total Time: "); ob1.add(ob1, ob2); ob1.disp();
    }
}