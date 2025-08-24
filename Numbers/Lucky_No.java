import java.util.*;
class Lucky_No{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        int remove=2;
        
        int a[]=new int[num];
        
        for(int i=1;i<=a.length;i++){
            a[i-1]=i;
        }
        
        int count;
        while (remove <= num) {
            count = 0;
            for(int i = 0; i < num; i++) {
                if (a[i] != 0) {
                    count++;
                    if (count % remove == 0) {
                        a[i] = 0;
                    }
                }
            }
            int next = -1;
            for (int i = remove; i < num; i++) {
                if (a[i] != 0) {
                    next = a[i];
                    break;
                }
            }
            if (next == -1) break;
            remove = next;
        }
        
        for(int i = 0; i < num; i++){
            if(a[i] != 0)System.out.print(a[i] + " ");
        }
        in.close();
    }
}