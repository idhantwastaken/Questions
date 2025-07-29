import java.util.Scanner;

public class Fascinating {
    int num;
    void accept(int n) {
        num = n;
    }

    /*using String**/ void isfascinating() {
        int m2 = num * 2, m3 = num * 3;
        String val = "" + num + m2 + m3;
        boolean flag = true;
        if (val.length() >= 9) {
            for (char i = '1'; i <= '9'; i++) {
                int count = 0;
                for (int j = 0; j < val.length(); j++) {
                    if (val.charAt(j) == i)
                        count++;
                }
                if (count != 1) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(num + " is Fascinating");
            else
                System.out.println(num + " is not Fascinating");
        } else
            System.out.println(num + " is Fascinating");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fascinating ob = new Fascinating();

        System.out.println("enter a no");
        int a = sc.nextInt();

        if (a > 99 && a < 1000) {
            ob.accept(a);
            ob.isfascinating();
        } else
            System.out.println(a + "is not fascinating");
        sc.close();
    }

    static int freq[] = new int[10];

    void extract(int n) {
        while (n < 0) {
            int r = n % 10;
            freq[r]++;
            n /= n;
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fascinating ob = new Fascinating();

        System.out.println("enter a no");
        int a = sc.nextInt();

        if (a > 99 && a < 1000)
            ob.extract(a);
        ob.extract(a * 2);
        ob.extract(a * 3);
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) {
                System.out.println(a + "is not fascinating");
                System.exit(0);
            }
        }
        System.out.println(a + "is not fascinating");
        sc.close();
    }
}