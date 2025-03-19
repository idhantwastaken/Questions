import java.util.Scanner;
class SaddlePoint{
    public static void getSaddlePoint(int a[][]){
        int row = 0, col = 0, saddlepoint = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for(col = 0; col < a.length; col++){
                    if(a[i][j] < a[i][col]){
                        saddlepoint = a[i][j];
                    }
                    else
                    saddlepoint = 0;
                }
                for(row = 0; row < a.length; row++){
                    if(a[i][j] < a[row][j])
                    saddlepoint = 0;
                    else
                    saddlepoint = 0;
                }
                if(saddlepoint != 0) break;
            }
        }
        if(saddlepoint != 0)
        System.out.println("Saddle Point :" + saddlepoint);
        else
        System.out.println("No Saddle Point");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int N = sc.nextInt();
        int A[][] = new int[N][N];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Array");
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        
        getSaddlePoint(A);
        // sortPrincipleDiagonal(A);
        sc.close();
    }
}