public class Perfect {

//no recursion
    public static boolean isPerfect(int n) {
        if (n <= 0) return false; // Perfect numbers are positive integers
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n = 33550336; // Example number
        if (isPerfect(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
