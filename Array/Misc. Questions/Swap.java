import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int A[][] = new int[M][N];
        System.out.println("Enter " + (M * N) + " integers");
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i = 0; i < M; i++){
            System.out.println(Arrays.toString(A[i]));
        }
        System.out.println("Inverted Matrix");
        for(int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[M - 1][j];
                A[M - 1][j] = temp;
            }
            System.out.println(Arrays.toString(A[i]));
        }
        sc.close();
    }
}
