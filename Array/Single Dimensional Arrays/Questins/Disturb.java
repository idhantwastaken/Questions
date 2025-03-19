import java.util.*;
class Disturb{
    public static void disturb(int a[]){
        // For random integer between m and n (both inclusive)
        // m+(int)(Math.random()*(n-m+1))
        // For array, m=0, length-1
        // (int)(Math.random()*(length+1))
        int j, temp;
        for(int i=a.length-1;i>=1;i--){
            j=(int)(Math.random()*(i));
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
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
        disturb(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
