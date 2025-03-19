public class Sine {
    // Sine without using Math class
    // Sine Series sin(x) = x - x^3/3! + x^5/5! - upto .00001 accuracy
    public static float sin(float x){
        float sin = x, temp = 1;
        double fact = 1;
        for(int i = 2; i <= 15; i = i + 2){
            fact = fact * i * (i - 1);
            if(i % 2 == 1)
                sin += ((x * temp) / fact);
            else
                sin -= ((x * temp) / fact);
            temp *= x * x; 
        }

        return sin;
    }
    public static void main(String[] args) {
        System.out.println(sin(30));
    }
}