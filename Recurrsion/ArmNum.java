import java.util.Scanner;

public class ArmNum {
    int n, l;
    ArmNum(int nn) {
        n = nn;
        l = (int) Math.log10(n) + 1;
    }

    int sum_pow(int i) {
        if(i > l) return 0;
        else {
            int d = n % 10;
            n /= 10;
            return (int)Math.pow(d, l) + sum_pow(i + 1);
        }
    }

    void isArmstrong() {
        int t = n;
        if(sum_pow(1) == t) System.out.println(t + " is an Armstrong Number.");
        else System.out.println(t + " is not an Armstrong Number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number.");
        int nn = sc.nextInt();
        ArmNum ob = new ArmNum(nn);
        ob.isArmstrong();
        sc.close();
    }
}
