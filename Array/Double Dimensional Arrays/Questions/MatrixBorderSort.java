/*
2D Array: Sort the Boundary Elements

Write a program to declare a matrix A[][] of order M x N, where
m is the number of rows and n is the number of columns such that
both m and n must be greater than 2 and less than 20. Allow the user
to input positive integers into this matrix.
Perform the following tasts on the matrix:
a) Sort the elements of the outer rows and columns in ascending order
   using any standard sorting technique and arrange them in an array.
b) Calculate the sum of the outer row and column elements.
c) Output the original matrix, rearranged matrix and only the border
   elements of the rearranged array with their sum.

Test your program for the following data and some random data:
Example 1:
INPUT:  M = 3
        N = 3
        
OUTPUT:
        ORIGINAL MATRIX
        1   7   4
        8   2   5
        6   3   9
        REARRANGED MATRIX
        1   3   4
        9   2   5
        8   7   6
        BOUNDARY ELEMENTS
        1   3   4
        9       5
        8   7   6
        SUM OF THE OUTER ROW AND COLUMN ELEMENTS = 43

Example 2:
INPUT:   M = 2
         N = 3
         7  1  6
         8  9  2      
OUTPUT:  
                ORIGINAL  MATRIX
         7  1  6
         8  9  2      
         REARRANGED  MATRIX
         1  2  6
         9  8  7
         BOUNDARY  ELEMENTS
         1  2  6
         9  8  7
         SUM OF THE OUTER ROW AND COLUMN ELEMENTS  =  33

Example 4:
INPUT:   M = 4
         N = 4
         9  2  1  5
         8  13 8  4
         15 6  3  11
         7  12 23 8
OUTPUT:
         ORIGINAL  MATRIX
         9  2  1  5
         8  13 8  4
         15 6  3  11
         7  12 23 8
         REARRANGED  MATRIX
         1  2  4  5
         23 13 8  7
         15 6  3  8
         12 11 9  8
         BOUNDARY  ELEMENTS
         1  2  4  5
         23       7
         15       8
         12 11 9  8
         SUM OF THE OUTER ROW AND COLUMN ELEMENTS  =  105
 */
import java.util.*;

class MatrixBorderSort {
    private int A[][], M, N, outer[], col, row, sum;

    public MatrixBorderSort(int M, int N) {
        this.M = M;
        this.N = N;
        A = new int[M][N];
        outer = new int[2 * N + 2 * (M - 2)];
        sum=0;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    public void sortBoundaryelements() {
        int index = 0;
        for (col = 0; col < N; col++) {
            outer[index++] = A[0][col];
            if (M > 1)
                outer[index++] = A[M - 1][col];
            sum += A[0][col] + A[M - 1][col];
        }
        for (row = 1; row < M - 1; row++) {
            outer[index++] = A[row][0];
            if (N > 1)
                outer[index++] = A[row][N - 1];
            sum+= A[row][0]+A[row][N - 1];
        }
        Arrays.sort(outer);
        // Top L-R
        index = 0;
        for (int i = 0; i < N; i++) {
            A[0][i] = outer[index++];
        }

        // Righ T-B
        for (int i = 1; i < M - 1; i++) {
            A[i][N - 1] = outer[index++];
        }
        // Bottom R-L
        for (int i = N - 2; i >= 0; i--) {
            A[M - 1][i] = outer[index++];
        }

        // Left B-T
        for (int i = M - 2; i >= 1; i--) {
            A[i][0] = outer[index++];
        }
    }
    public int getSum(){
        return sum;
    }
    public void display() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == M - 1 || j == 0 || j == N - 1) {
                    System.out.print(A[i][j] + "\t");
                } else
                    System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println("Sum of border elements: "+getSum());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows and Coloumns");
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        if (M > 2 && M < 20 && N > 2 && N < 20) {
            MatrixBorderSort obj = new MatrixBorderSort(M, N);
            obj.input();
            obj.sortBoundaryelements();
            obj.display();
        }
        sc.close();
    }
}