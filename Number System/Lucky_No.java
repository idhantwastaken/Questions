import java.util.*;
class Lucky_No{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        int count = 1;
        int remove=2;
        int digit=3;
        int a[]=new int[num];

        for(int i=1;i<=a.length;i++){
            a[i-1]=i;
        }

        while (remove <= num) {
            for(int i = 1; i <= num; i++){
                if(i == (remove * count)){
                    a[i - 1] = 0;
                    count++;
                }
            }
            count = 1;
            remove = remove + digit;
            digit++;
        }
        for(int i = 0; i < num; i++){
            if(a[i] != 0)System.out.print(a[i] + " ");
            else System.out.print(" ");
        }
        in.close();
    }
}