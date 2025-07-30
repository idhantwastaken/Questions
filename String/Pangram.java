/*
 * A pangram, or holoalphabetic sentence, is a sentence that 
 * contains every letter of the alphabet at least once.
 */
public class Pangram {
    public static boolean isPangram(String str){
        int status=0;
        char ch;
        for(int i=0; i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isUpperCase(ch)) status |= 1<<(ch-'A');
            else if(Character.isLowerCase(ch)) status |= 1<<(ch-'a');
            // System.out.println(Integer.toBinaryString(status));
            if(status==0b11111111111111111111111111) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog."));
        System.out.println(isPangram("The fat brown fox jumped over the lazy dog."));
    }
}
