import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int b[]){
        int a[]=b.clone();
        int end = a.length;
        for(int i=0; i<end;i++){
            for(int j=i+1; j<end;j++){
                if(a[i]==a[j]){
                    a[j]=a[end-1];
                    end--;
                    j--;
                }
            }
        }
        int []unique = new int[end];
        for(int i=0;i<end;i++){
            unique[i]=a[i];
        }
        return unique;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array and the Array");
        int []a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
        }
        int b[] = removeDuplicates(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        sc.close();
    }
}
