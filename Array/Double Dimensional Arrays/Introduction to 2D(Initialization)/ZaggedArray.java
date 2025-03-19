public class ZaggedArray {
    public static void main(String[] args) {
        // int a[][]={      //Static initialization of zagged array
        //     {1,2,3},
        //     {1,2,3,4,5,6},
        //     {1,2,3,4}
        // };

        // int a[][]=new int[(int)(1+Math.random()*10)][];   // Random Zagged Array
        // for(int i=0; i<a.length;i++){
        //     a[i]=new int[(int)(1+Math.random()*10)];
        // }

        int a[][]=new int[5][];    //Triangular Array 
        for(int i=0; i<a.length;i++){
            a[i]=new int[i+1];
        }

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
