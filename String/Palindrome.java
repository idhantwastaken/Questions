public class Palindrome {
    /*
     * public static boolean isPalindrome(String str){
     * return isPalindrome(str, 0, "");
     * }
     * 
     * public static boolean isPalindrome(String str, int index, String rev){
     * char ch;
     * if(index < str.length()){
     * ch = str.charAt(index);
     * return isPalindrome(str, index + 1, ch + rev);
     * }
     * if(str.equalsIgnoreCase(rev)) return true;
     * else return false;
     * }
     */
    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0);
    }

    public static boolean isPalindrome(String str, int index) {
        if (index < str.length() / 2) {
            if (str.charAt(index) == str.charAt(str.length() - 1 - index))
                return isPalindrome(str, index + 1);
            else
                return false;
        }
        return true;
    }

    public static boolean isPalindromicPhrase(String str) {
        str=str.toLowerCase();
        int start = 0, end = str.length()-1;
        return isPalindromicPhrase(str, start, end);

    }

    public static boolean isPalindromicPhrase(String str, int start, int end) {
        if (start > end)
            return true;
        char ch, ch1;
        ch = str.charAt(start);
        ch1 = str.charAt(end);

        if (!Character.isLetter(ch)) {
            start++;
            ch = str.charAt(start);
        }
        if (!Character.isLetter(ch1)) {
            end--;
            ch1 = str.charAt(end);
        }
        if (ch1 != ch) {
            return false;
        }

        return isPalindromicPhrase(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("sir"));
        // "Was it a car or a cat I saw?"
        System.out.println(isPalindromicPhrase("Was it a car or a cat I saw?"));// true
        System.out.println(isPalindromicPhrase("Was it a car or a cat?"));// false

    }
}
