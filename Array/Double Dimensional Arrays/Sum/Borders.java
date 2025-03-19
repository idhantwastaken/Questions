class Borders {
    public static void main(String[] args) {
        // int a[][] = {
        //         { 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1 }
        // };

        int a[][] = {
                { 1, 1, 1, 1, 1, 1, 1 }
        };

        int sumBorders = 0;
        for (int row = 0; row < a.length; row++) {
            sumBorders += a[row][0];
            if (a[0].length > 1)
                sumBorders += a[row][a.length - 1];
        }

        for (int col = 1; col < a[0].length - 1; col++) {
            sumBorders += a[0][col];
            if (a.length > 1)
                sumBorders += a[a.length - 1][col];
        }
        System.out.println("Sum of border elements: " + sumBorders);
    }
}
