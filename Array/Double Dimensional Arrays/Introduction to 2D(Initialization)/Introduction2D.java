class Introduction2D {
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        int c = 1;
        
        /* row major initialization
        for(int row=0; row<a.length;row++){
            for(int col=0; col<a[row].length;col++){
                a[row][col]=c++;
            }
        }
        */
        //  column major initialization
        for (int col = 0; col < a[0].length; col++) {
            for (int row = 0; row < a.length; row++) {
                System.out.println(row+", "+col);
                a[row][col] = c++;
            }
        }
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
    }
}