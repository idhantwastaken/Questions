import java.util.*;
public class Palin {
    int n, revn;        // Declaring Data Members
    
    Palin() {           // Default Const. to initialise datamems to 0
        n = revn = 0;
    }
    
    void accpet() {     //func to take input in n
        Scanner sc = new Scanner(System.in);
        System.out.println("EN n");
        n = sc.nextInt();
        sc.close();
    }
    
    int reverse(int y) {        //func to reverse a num and return it
        byte l = (byte)(1 + (byte)Math.log10(y));       //length of the no in y
        if(y < 10) return y;
        else {
            return (int)((y % 10) * Math.pow(10, l - 1)) + reverse(y / 10);
        }
    }

    void pal() {        //to check
        revn = reverse(n);
        if(n == revn) System.out.println("Pal");
        else System.out.println("!pal");
    }
    
    public static void main(String[] args) {        //main
        Palin ob = new Palin();
        ob.accpet();
        ob.pal();
        
    }
}
