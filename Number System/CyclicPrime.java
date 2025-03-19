/*
A Circular Prime is a prime number that remains prime 
under cyclic shifts of its digits. 
When the leftmost digit is removed and replaced at the 
end of the remaining string of digits, the generated 
number is still prime. 
The process is repeated until the original number is reached again.
A number is said to be prime if it has only two factors I and itself.

Example:
131
311
113
Hence, 131 is a circular prime.

Test your program with the sample data and some random data:

Example 1
INPUT:  N = 197
OUTPUT: 197
        971
        719
        197 IS A CIRCULAR PRIME

Example 2
INPUT:  N = 1193
OUTPUT: 1193
        1931
        9311
        3119
        1193 IS A CIRCULAR PRIME

Example 3
INPUT:  N = 29
OUTPUT: 29
        92
        29 IS NOT A CIRCULAR PRIME 
 */
import java.util.*;
public class CyclicPrime {
    public static boolean isPrime(int n, int i){
        if (n <= 2) 
        return (n == 2) ? true : false; 
        if (n % i == 0) 
        return false; 
        if (i * i > n)
        
        return true;
        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        
        if(isPrime(n, 2)){
            while(n>0){
                n=n/10;
                
            }
        }
        else System.out.println(n + " is not a Circular Prime");
        sc.close();
    }
}
