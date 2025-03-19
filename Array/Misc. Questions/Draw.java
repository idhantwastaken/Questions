import java.util.*;
public class Draw {
    public static String luckyDraw(String a[]){
        int index = 0;
        while (index > 0 && index < a.length) {
            index = 10 * (int)Math.random();
        }
        return a[index];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[5];
        
        System.out.println("Enter the number of Winners");
        int win = sc.nextInt();
        System.out.println("Enter 20 names");
        for(int i = 0; i < names.length; i++){
            names[i] = sc.nextLine();
        }
        for(int i = 0; i < win; i++)
            System.out.println(luckyDraw(names));
        sc.close();
    }
}
