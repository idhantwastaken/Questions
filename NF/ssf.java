import java.util.Scanner;
public class ssf {
    int x, n;
    double sum;
    
    public ssf() {
        x = n = 0;
        sum = 0;
    }
    
    double fact(int num){
        int prod = 1;
        for (int i = 2; i <= num; i++) {
            prod *= i;
        }
        return prod;
    }
    
    double term(int p, int q){
        return p/fact(q);
    }
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x n");
        x = sc.nextInt();
        n = sc.nextInt();
        sc.close();
    }
    
    void calculatSum(){
        int numer = x;
        for (int i = 1; i <= n; i++) {
            sum += term(numer,i);
            numer *= x*x;
        }
    }

    void dispSum(){
        System.out.println("Sum :" + sum);
    }
    
    public static void main(String[] args) {
        ssf ob = new ssf();
        ob.accept();
        ob.calculatSum();
        ob.dispSum();
    }
}
