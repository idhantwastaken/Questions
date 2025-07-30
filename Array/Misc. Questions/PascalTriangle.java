/*
 * Pascal triangle for a given number of rows.
 * N = 5
 * Output:
 *                  1
 *              1       1
 *          1       2       1
 *      1       3       3       1 
 * 1        4       6       4       1
 */
public class PascalTriangle {
    static void generateTriangle(int n) {
        int a[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
        }
        a[0][0] = 1;
        a[1][0] = 1;
        a[1][1] = 1;
        for (int row = 2; row < n; row++) {
            a[row][0] = 1;
            a[row][row] = 1;
            for (int col = 1; col < row; col++) {

                a[row][col] = a[row - 1][col - 1] + a[row - 1][col];

            }
        }

        for (int row = 0; row < n; row++) {
            for(int tab=1; tab<a.length-row;tab++) System.out.print("\t");
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        generateTriangle(7);
    }
}
