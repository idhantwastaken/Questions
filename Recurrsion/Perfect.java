import java.util.*;
public class Perfect {
    int num;        // Declaring Data Members

    Perfect(int n) {num = n;}       //Param Constructor
    
    int sumfact(int i) {        //func to calc. sum of prime factor
        if(i > num / 2) return 0;
        if(num % i == 0) return i + sumfact(++i);
        return sumfact(++i);
    }

    void isPerf() {     //func to check if num is a perfect no.
        if(sumfact(1) == num) System.out.println("P");          //condition
        else System.out.println("!P");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N");
        Perfect ob = new Perfect(sc.nextInt());
        ob.isPerf();
        sc.close();
    }

}