/*
* I 1
* V 5
* X 10
* L 50
* C 100
* D 500
* M 1000
*/
public class Roman {
    static int magnitude[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    static String symbol[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    
    public static String integerToRoman(int n) {
        
        String answer = "";
        int times;
        for (int i = magnitude.length - 1; i >= 0; i--) {
            times = n / magnitude[i];
            for (int j = 1; j <= times; j++) {
                answer += symbol[i];
            }
            n = n % magnitude[i];
        }
        return answer;
    }
    public static int Search(String item){
        for (int i = 0; i < symbol.length; i++) {
            if (item == symbol[i]){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    
    public static int romanToInteger(String str) {
        int answer = 0, index = 2, pos = 0;
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            temp = "" + str.charAt(i);

            for (int j = 0; j < symbol.length; j++) {
                if (temp == symbol[j] && j > index){
                    index = j;
                }
            }

            if(pos > index)
            index = pos;
            System.out.println(index + "d");
        }
        pos = 0;
        temp = "";
        for(int i = 0; i < str.length(); i++){
            if(i < (str.length() - 2))temp = "" + str.charAt(i) + str.charAt(i+1);
            else temp = "" + str.charAt(i);
            pos = Search(temp);
            if(pos != -1){
                temp = "" + str.charAt(i);
                pos = Search(temp);
            }
            if(pos != -1){
                if(pos >= index)
                answer += magnitude[pos];
                else
                answer -= magnitude[pos];
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(romanToInteger("XII"));//12
        System.out.println(romanToInteger("XCIV"));//94
        System.out.println(integerToRoman(1500));//MD
        System.out.println(integerToRoman(12));
        System.out.println(integerToRoman(9));
        
    }
}
