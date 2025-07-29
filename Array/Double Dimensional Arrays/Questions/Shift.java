import java.util.*;
public class Shift {
    int a[][], m, n;
    static Scanner sc = new Scanner(System.in);
    Shift(int m, int n) {
        this.m = m;
        this.n = n;
        
        a = new int[m][n];
    }
    
    void input() {
        System.out.println("Enter " + (m * n) + "  numebers");
        for (int[] is : a) {
            for (int i = 0; i < n; i++) {
                is[i] = sc.nextInt();
            }
        }
    }
    
    void cyclic(Shift P) {
        for (int i = 0; i < m; i++) {
            if (i == 0)  this.a[m - 1] = P.a[i];
            else this.a[i - 1] = P.a[i];
            
        }
    }
    
    void disp() {
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter size");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        Shift ob1 = new Shift(m, n);
        Shift res = new Shift(m, n);
        
        ob1.input();
        System.out.println("Orig:"); ob1.disp();
        res.cyclic(ob1);
        System.out.println("Shift"); res.disp();
    }
}
