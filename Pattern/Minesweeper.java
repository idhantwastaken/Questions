class Minesweeper {
    static void populate(char a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == ' ')
                    a[i][j] = '0';
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == '*'){
                    int row[] = {i - 1, i - 1, i - 1 ,i , i, i + 1, i + 1, i + 1};
                    int col[] = {j - 1, j , j + 1, j - 1, j + 1, j - 1, j , j + 1};
                    for(int k = 0; k < 8; k++){
                        if(row[k] > -1 && col[k] > -1 && row[k] < a.length && col[k] < a[i].length)
                        if(a[row[k]][col[k]] != '*') a[row[k]][col[k]]++;
                    }
                }
            }
        }
    }
    static void display(char a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char board[][] = {
            {'*','*','*','*','*',' ','*','*','*','*'},
            {'*',' ','*',' ','*',' ','*',' ','*','*'},
            {'*','*','*','*','*','*','*','*','*','*'},
            {'*',' ','*',' ','*',' ','*',' ',' ','*'},
            {'*','*','*','*','*','*','*','*','*','*'},
            {'*',' ','*',' ','*',' ','*',' ','*','*'},
            {'*','*','*','*','*','*','*','*',' ','*'},
            {'*',' ','*',' ','*',' ','*',' ','*','*'},
            {'*','*','*','*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*','*',' ','*'},
        };
        populate(board);
        display(board);
    }
    
}
