class LCMHCF {
    public static int getLCM(int a[]) {// ... represents variable arguments method
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }
       return product / getHCF(a);
    }
    public static int getHCF(int n[]){
        int maximum = n[0];
        for(int i = 0; i < n.length; i++){
            if(n[i] > maximum) maximum = n[i];
        }
        boolean check;
        for(int i = maximum; i >= 1; i--){
            check = true;
            for(int j =0; j < n.length; j++){
                if(n[j] % i != 0){
                    check = false;
                    break;
                }
            }
            if(check) return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        System.out.println(getLCM(a));
        System.out.println(getHCF(a));
    }
}