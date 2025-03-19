class NumberToWords {
    public static String convertIntegerToWords(int n) {
        String answer = "";
        String arr1[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String arr2[] = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        int factor[] = { 1000000000, 10000000, 100000, 1000, 100, 1 };
        String unit[] = { "Arab", "Crore", "Lakh", "Thousand", "Hundred", "" };
        int quotient, units, tens;
        if(n<0){
            answer="Negative ";
            n=-n;
        } 
        for (int i = 0; i < factor.length; i++) {
            quotient = (n / factor[i]);
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
            n = n % factor[i];
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println("1001230067: " + convertIntegerToWords(1001230067));
        System.out.println("2147483647: "+convertIntegerToWords(2147483647));
        System.out.println("10005006: "+convertIntegerToWords(10005006));
        System.out.println("-10005006: "+convertIntegerToWords(-10005006));

    }
}