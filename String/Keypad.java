import java.util.*;
public class Keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word.");
        String str = sc.next().toUpperCase();
        String keypad[] = {".,?","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int noofkeypress[] = {0,0,0,0,0,0,0,0,0};
        int index;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < keypad.length; j++) {
                index = keypad[j].indexOf(str.charAt(i));
                if(index > -1) noofkeypress[j] += index + 1;
            }
        }
        System.out.println("Button\t\tNumber of presses");   
        for (int i = 0; i < noofkeypress.length; i++) {
            System.out.println((i + 1) + "\t\t" + noofkeypress[i]);
        }
        sc.close();
    }
}