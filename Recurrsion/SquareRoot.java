// import java.util.Scanner;
class SquareRoot {
    public static float squareRootRecursive(int a){
        return squareRootRecursive(a, 1, 0, 1);
    }
    public static float squareRootRecursive(int a, float delta, float guess, int count){
        if(count > 8000) return -1.0f;
        if(guess * guess < a){
            return squareRootRecursive(a, delta, guess + delta, count + 1);
        }
        else if(Math.abs(a-(guess * guess)) < 0.5f) return guess;
        else return squareRootRecursive(a, delta / 10, guess - delta + delta/10, count + 1);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // System.out.println(squareRootRecursive(n));//5
        // sc.close();
        int count = 0;
        for (int i = 0; i <= 4000000; i++) {
            float a = squareRootRecursive(i);
            if(a < 0){
                count += 1;
                System.out.println(i+": " + a);
            }
        }
        System.out.println(count);
    }
}