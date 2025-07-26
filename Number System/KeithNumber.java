

import java.util.*;
class KeithNumber {
     static boolean isKeith(int n) {

        return false;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isKeith(n)) {
            System.out.println(n + " is a keith no.");
        } else System.out.println(n + " is a keith no.");
        sc.close();
    }
}
