public class BaseConversion {
    public static String convertFronDecToBase(int number, int targetBase){
        return convertFronDecToBase(number, targetBase, "");
    }
    public static String convertFronDecToBase(int n, int targetBase, String answer){
        if(n > 0){
            int r = n % targetBase;
            if(r < 10) answer = r + answer;
            else{
                char ch = (char)((r - 10) + 65);
                answer = ch + answer;
            }
            return convertFronDecToBase(n / targetBase, targetBase, answer);
        }
        else return answer;
    }
    public static String convertBase10To2(int n){
        return convertBase10To2(n, "");
    }
    public static String convertBase10To2(int n, String binary){
        if(n > 0){
            int r = n % 2;
            binary = r + binary;
            return convertBase10To2(n / 2, binary);
        }
        else return binary;
    }
    public static void main(String[] args) {
        System.out.println(convertFronDecToBase(26, 16));
        System.out.println(convertBase10To2(25));
    }
}
