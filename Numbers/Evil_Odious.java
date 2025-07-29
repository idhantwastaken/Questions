import java.util.*;
public class Evil_Odious {
    public static String toString(int n){
        String ans = "";
        while(n > 0){
            if(n % 2 == 0) ans += "0";
            else ans += "1";

            n = n / 2;
        }
        return ans;
    }

    public static void evilOdious(int n){
        String str = toString(n); int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') count++;
        }
        if(count % 2 == 0) System.out.println(n + " is evil");
        else System.out.println(n + " is odious");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        evilOdious(n);
        sc.close();

    }
}
