public class SpecialNumber {
    public static int getFactorial(int n) {// digits only
        int factorial[] = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
        return factorial[n];
    }

    public static void main(String[] args) {
        // Special Number
        // 145 = 1! + 4! + 5! =145 
        // How many Special numbers are there in the entire range of int.
        int count = 0, digit, sum;
        final int MAX=362880*9;
        for (int i = 0; i < MAX; i++) {
            sum = 0;
            for (int temp = i; temp > 0; temp /= 10) {
                digit = temp % 10;
                sum += getFactorial(digit);
            }
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
