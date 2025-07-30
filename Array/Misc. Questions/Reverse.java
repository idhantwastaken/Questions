import java.util.*;
public class Reverse {
    public static void reverse(int a[]){
        int temp, half=a.length/2;
        for(int i=0; i<=half;i++){
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array and the Array");
        int []a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
