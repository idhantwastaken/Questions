class MagicSquare {
    public static boolean isMagicSquare(int a[][]) {
        if (a == null) return false;
        if (a.length != a[0].length) return false;

        int N = a.length;
        int max = N * N;
        int expectedSum = (max * (max + 1) / 2) / N;
        boolean digit[] = new boolean[max];

        for (int row = 0; row < a.length; row++) {
            int dia1 = 0, dia2 = 0, rsum = 0, csum = 0;
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] < 1 || a[row][col] > max)
                    return false;
                if (digit[a[row][col] - 1] == true)
                    return false;
                else
                    digit[a[row][col] - 1] = true;
                    
                dia1 = dia1 + a[col][col];
                dia2 = dia2 + a[col][a.length - 1 - col];
                rsum = rsum + a[row][col];
                csum = csum + a[col][row];
            }
            if (dia1 != expectedSum || dia2 != expectedSum) {
                return false;
            }
            if (rsum != expectedSum || csum != expectedSum) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * A magic square of size N is an arrangement of numbers from 1 to N^2 
         * in a square grid, where the numbers in each row, and in each column, and the 
         * numbers in the forward and backward main diagonals, all add 
         * up to the same number.
         * 
         * 4    9   2
         * 3    5   7
         * 8    1   6
         */

        int a[][] = {    //Right conditions
                { 4, 9, 2 },
                { 3, 5, 7 },
                { 8, 1, 6 }
        };

        // int a[][] = {    //Repetition
        //         { 4, 1, 2 },
        //         { 3, 5, 7 },
        //         { 8, 1, 6 }
        // };

        // int a[][] = {    //Out of Range
        //         { 4, 10, 2 },
        //         { 3, 5, 7 },
        //         { 8, 1, 6 }
        // };
        System.out.println(isMagicSquare(a));

    }
}