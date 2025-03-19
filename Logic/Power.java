import java.util.Scanner;
public class Power {
    public static boolean isPowerof2(int a){
        int temp = 0;
        for(int i = 1; i <= a; i = (int)Math.pow(2,temp++) ){
            if(i == a) return true;
        }
        return false;


        // String str = Integer.toBinaryString(a);
        // str = str.replace('0',' ');
        // str = str.trim();
        // if (str != "1") return false;
        // else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        if(n > 0) System.out.println(isPowerof2(n));
        sc.close();
    }
    
}
