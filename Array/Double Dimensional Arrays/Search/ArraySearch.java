/*
 * Write a program using a method search2D(int a[][], item) which
 * returns the position of the item in the 2D array a.
 */
class Position{
    int row,col;
    public Position(){
        row=col=-1;
    }
    public String toString(){
        return "Row: "+row+", Col:"+col;
    }
}
class ArraySearch{
    public static Position search2D(int a[][], int item){
        Position result = new Position();
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == item){
                    result.row=i;
                    result.col=j;
                    break;
                }
            }
        }


        return result;
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(search2D(a, 4));
    }
}