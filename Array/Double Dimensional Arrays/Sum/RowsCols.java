public class RowsCols {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 }
        };

        int rowSum = 0, colSum = 0;
        for (int row = 0; row < a.length; row++) {
            rowSum = 0;
            for (int col = 0; col < a[row].length; col++) {
                rowSum += a[row][col];
            }
            System.out.println("Sum of row " + row + " = " + rowSum);
        }
        for (int col = 0; col < a[0].length; col++) {
            colSum = 0;
            for (int row = 0; row < a.length; row++) {
                colSum += a[row][col];
            }
            System.out.println("Sum of col " + col + " = " + colSum);
        }
    }
}
