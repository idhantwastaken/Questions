import java.util.*;
public class Merger {
    long n1, n2, merg;
    Merger() {n1 = n2 = merg = 0;}
    
    void readNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no./s");
        n1 = sc.nextLong();
        n2 = sc.nextLong();
        sc.close();
    }
    
    void joinNum() {
        merg = Long.parseLong(Long.toString(n1) + Long.toString(n2));
        // merg = (long)(n1 * Math.pow(10, (int)Math.log10(n2) + 1) + n2);
        System.out.println(merg);
        
    }
    
    public static void main(String[] args) {
        Merger ob = new Merger();
        ob.readNum();
        ob.joinNum();
    }
}