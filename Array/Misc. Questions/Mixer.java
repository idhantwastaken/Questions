import java.util.*;
public class Mixer {
    
    static Scanner sc = new Scanner(System.in);
    
    int a[], n;
    Mixer(int n){
        this.n = n;
        a = new int[n];
    }

    void accept() {
        System.out.println("Enter " + n + " no./s");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    Mixer mix(Mixer A) {
        Mixer O = new Mixer(this.n + A.n);
        for (int i = 0; i < O.n; i++) {
            if (i < this.n) O.a[i] = this.a[i];
            else O.a[i] = A.a[i - A.n];
        }
        Arrays.sort(O.a);
        return O;
    }

    void disp() {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        System.out.println("Enter size");
        int n = sc.nextInt();

        Mixer ob1 = new Mixer(n);
        Mixer ob2 = new Mixer(n);

        ob1.accept(); ob2.accept();
        System.out.print("A1:"); ob1.disp();
        System.out.print("A2:"); ob2.disp();

        Mixer res = ob1.mix(ob2);
        System.out.print("Res:"); res.disp();

    }
}
