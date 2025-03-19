class FloatToWord {
    public static String convertFloatToWords(double n) {
        String answer = "";
        String arr1[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String arr2[] = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        int factor[] = { 1000000000, 10000000, 100000, 1000, 100, 1 };
        String unit[] = { "Arab", "Crore", "Lakh", "Thousand", "Hundred", "" };
        int quotient, units, tens;
        int integer = (int)(Math.floor(n));
        double fraction = n - integer;
        if(n<0){
            answer="Negative ";
            integer=-integer;
        } 
        for (int i = 0; i < factor.length; i++) {
            quotient = (integer/ factor[i]);
            if (quotient == 0)
            continue;
            if (quotient < 20) {
                answer += arr1[quotient] + " " + unit[i] + " ";
            } else {
                units = quotient % 10;
                tens = quotient / 10;
                if (units != 0)
                answer += arr2[tens - 2] + " " + arr1[units] + " " + unit[i] + " ";
                else
                answer += arr2[tens - 2] + " " + unit[i] + " ";
            }
            integer = integer % factor[i];
        }
        if(fraction != 0.0f){
            answer += "point ";
            for(fraction = fraction*10; fraction > 0; fraction = fraction *10){
                units = (int)fraction;
                answer += arr1[units] + " ";
                fraction -= units;
            }
        }
        
        return answer;
    }
    
    public static void main(String args[]) {
        System.out.println("1648065899.0235: " + convertFloatToWords(16428.0235));
        System.out.println("2147483647.235: "+convertFloatToWords(214747.235));
        System.out.println("10005006.518941: "+convertFloatToWords(1006.518941));
        System.out.println("10006.4489: "+convertFloatToWords(-10006.289));
        
        
    }
}