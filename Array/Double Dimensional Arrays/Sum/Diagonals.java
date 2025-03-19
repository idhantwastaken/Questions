public class Diagonals {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        int c = 1;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = c++;
            }
        }

        int sumPrimaryDiagonal = 0, sumSecondaryDiagonal=0;
        for (int i = 0; i < a.length; i++) {
            sumPrimaryDiagonal += a[i][i];
            sumSecondaryDiagonal+=a[i][a.length-1-i];
        }

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of primary diagonal: " + sumPrimaryDiagonal);
        System.out.println("Sum of secondary diagonal: " + sumSecondaryDiagonal);
    }
}
