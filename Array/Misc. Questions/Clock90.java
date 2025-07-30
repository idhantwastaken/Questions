import java.util.*;
public class Clock90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int M = sc.nextInt();
        int A[][] = new int[M][M];
        int B[][] = new int[M][M];
        System.out.println("Enter " + M * M + " integers");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        sc.close();
        System.out.println("Original Array");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "\t");
                B[j][M - 1 - i] = A[i][j];
            }
            System.out.println();
        }
        System.out.println("Rotated Array");
        for (int i = 0; i < M; i++) {
            System.out.println(Arrays.toString(B[i]));
        }
    }
}
