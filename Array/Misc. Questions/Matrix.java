import java.util.*;
public class Matrix {
    int a[][], m, n;
    static Scanner sc = new Scanner(System.in);
    Matrix(int m, int n) {
        this.m = m; this.n = n;
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
    
    Matrix subMat(Matrix A) {
        Matrix R = new Matrix(this.m, A.n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                R.a[i][j] = A.a[i][j] - this.a[i][j];
            }
        }
        return R;
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
        
        Matrix ob1 = new Matrix(m, n);
        Matrix ob2 = new Matrix(m, n);

        ob1.readArray(); ob2.readArray();
        System.out.println("A:"); ob1.disp();
        System.out.println("B:"); ob2.disp();

        Matrix res = ob2.subMat(ob1);
        System.out.println("A - B:"); res.disp();
    }
}
