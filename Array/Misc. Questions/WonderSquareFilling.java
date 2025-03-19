import java.util.Scanner;
class WonderSquareFilling{
    public static void wonderousFilling(int a[][]){
        int len = a.length;
        int row = 0, col = len / 2;
        for(int i = 1; i <= len * len; i++){
            if(a[row][col] == 0)
            a[row][col] = i;
            else
            a[++row][col] = i;
            row--; col++;
            if(row < 0) row = len - 1;
            if(col > len - 1) col = 0;
        }
        for(int i = 0; i < len; i++){
            for (int j = 0; j < len; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Square (MUST BE ODD)");
        int n = sc.nextInt();
        
        if(n % 2 == 1){
            int wonderousSquare[][] = new int[n][n];
            wonderousFilling(wonderousSquare);
        }
        else
            System.out.println("Invalid Input");
        sc.close();
    }
}