public class FibonacciRecursive {
    public static boolean isFibonacci(int num){
        return isFibonacci(num,0,1);
        
    }
    public static boolean isFibonacci(int n,int a,int b){
        int sum = a + b; 
        if(n<sum){
            return false;
        }
        else if(n>sum){
            return isFibonacci(n,b,sum);
        }
        else{
            return true;
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println(isFibonacci(8));//true
        System.out.println(isFibonacci(7));//false
    }
}
