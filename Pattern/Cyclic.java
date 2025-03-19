class Cyclic {
    public static void display(int a[][]){
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] fillCyclic(int n){
        int a[][]=new int[n][n];
        int l1 = 0, l2 = n - 1, l3 = n - 1, l4 = 0;
        for(int i = 1; i <= n*n;){
            for(int lr = l4; lr <= l2; lr++){
                a[l1][lr] = i;
                i++;
            }
            l1++;
            for(int tb = l1; tb <= l3; tb++){
                a[tb][l2] = i;
                i++;
            }
            l2--;
            for(int rl = l2; rl >= l4; rl--){
                a[l3][rl] = i;
                i++;
            }
            l3--;
            for(int bt = l3; bt >= l1; bt--){
                a[bt][l4] = i;
                i++;
            }
            l4++;
        }
        return a;
    }
    public static int[][] fillCyclic(int m, int n){
        int a[][]=new int[m][n], product=m*n;
        int l1 = 0, l2 = n - 1, l3 = m - 1, l4 = 0;
        for(int i = 1; i <= product;){
            for(int lr = l4; lr <= l2; lr++){
                a[l1][lr] = i;
                i++;
            }
            l1++;
            if(i>product) break;
            for(int tb = l1; tb <= l3; tb++){
                a[tb][l2] = i;
                i++;
            }
            l2--;
            if(i>product) break;
            for(int rl = l2; rl >= l4; rl--){
                a[l3][rl] = i;
                i++;
            }
            l3--;
            if(i>product) break;
            for(int bt = l3; bt >= l1; bt--){
                a[bt][l4] = i;
                i++;
            }
            l4++;
            if(i>product) break;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[][]=fillCyclic(3,3);
        display(a);
    }
}