import java.util.Scanner;
public class Happy {
    int n;
    public Happy(){ n = 0;}

    void getNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        sc.close();
    }

    int sum_sq_digit(int x){
        if(x == 0) return 0;
        else return (x % 10)*(x % 10) + sum_sq_digit(x / 10);
    }

    void isHappy(){
        int s = sum_sq_digit(n);
        while(s > 9){
            s = sum_sq_digit(s);
        }
        if(s == 1) System.out.println(n + " is Happy");
        else System.out.println(n + " is Sad");
    }
    public static void main(String[] args) {
        Happy ob = new Happy();
        ob.getNum();
        ob.isHappy();
    }
}
