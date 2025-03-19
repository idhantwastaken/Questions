
/*
Write a program to declare a matrix A[][] of order (MxN) where 'M' is the number of
rows and 'N' is the number of coloumns such that the values of both 'M' and 'N' must be
greater than 2 and less than 10. Allow the user to input integers into this matrix.
Perform the following tasks on the matrix:
(a) Display the original matrix.
(b) Sort each row of the matrix in ascending order using any standard sorting
technique.
(c) Display the changed matrix after sorting each row.

Test your program for the following data:
Example 1:
INPUT: M=4
       N=3
ENTER ELEMENTS OF MATRIX
11 -2 3
5 16 7
9 0 4
3 1 8

OUTPUT:
ORIGNAL MATRIX
11  -2  3
5   16  7
9   0   4
3   1   8

MATRIX AFTER SORTING
-2  3   11
5   7   16
0   4   0
1   3   8

Example 2:
INPUT: M=3
       N=3
ENTER ELEMENTS OF MATRIX
22  5   19
7   36  12
9   13  6

OUTPUT:
ORIGINAL MATRIX
22  5   19
7   36  12
9   13  6

MATRIX AFTER SORTING ROWS
5   19  22
7   12  36
6   9   13

Example 3:
INPUT: M=11
       N=5
OUTPUT:
MATRIX OUT OF RANGE
 */
import java.util.*;

class SortRows {
       public static void Matrixsort(int a[][]) {//Selection Sort
              int temp, position;
              for (int i = 0; i < a.length; i++) { // rows
                     for (int j = 0; j < a[i].length; j++) {
                            position = j;
                            for (int k = j + 1; k < a[i].length; k++) {
                                   if (a[i][k] < a[i][position]) {
                                          position = k;
                                   }
                            }
                            if (position != j) {
                                   temp = a[i][position];
                                   a[i][position] = a[i][j];
                                   a[i][j] = temp;
                            }
                     }
              }
       }

       public static void display(int a[][]) {
              System.out.println("Original Matrix :");
              displayArray(a);
              Matrixsort(a);
              System.out.println("Matrix After Sorting :");
              displayArray(a);
       }

       public static void displayArray(int a[][]) {
              for (int i = 0; i < a.length; i++) {
                     for (int j = 0; j < a[i].length; j++)
                            System.out.print(a[i][j] + "\t");
                     System.out.println();
              }

              // for (int i = 0; i < a.length; i++)
              //        System.out.println(Arrays.toString(a[i]));
       }

       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the no. of rows and coloumn");
              int M = sc.nextInt();
              int N = sc.nextInt();
              int a[][];
              if (M > 2 && M < 10 && N > 2 && N < 10) {
                     a = new int[M][N];
                     System.out.println("Enter the elements of the array");
                     for (int i = 0; i < a.length; i++) {
                            for (int j = 0; j < a[i].length; j++)
                                   a[i][j] = sc.nextInt();
                     }
                     display(a);
                     
              } else
                     System.out.println("Matrix out of Range");
                     
              sc.close();
       }
}