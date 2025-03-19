/* Decoding Secret Message

The computer department of the Agency of International Espionage is
trying to decode Intercepted messages. The agency’s spies have determined
that the enemy encodes Messages by first converting all characters to
their ASCII values and then reversing the string.

For example, consider A_z (the underscore is just to highlight the space).
The ASCII values of A, <space>, z are 65, 32, 122 respectively. Concatenate them to
get 6532122, then reverse this to get 2212356 as the coded message.

Write a program which reads a coded message and decodes it. The coded
message will not exceed 200 characters. It will contain only
alphabets (A …… Z, and a …….z) and spaces.

ASCII values of A ……Z are 65 ….. 90 and those of a……z are 97 …..122.

Test your Program for the following data and some random data.

SAMPLE DATA:

INPUT:
Encoded Message:
2312179862310199501872379231018117927
OUTPUT:
THE DECODED MESSAGE:    Have a Nice Day

INPUT:
Encoded Message:
23511011501782351112179911801562340161171141148
OUTPUT:
THE DECODED MESSAGE:    Truth Always Wins */
import java.util.*;
class SecretMessage{    
    public static String Decode(String a){
        String decodedmsg = "",decodeword = "";
        String words[] = a.split("32");
        
        for(int i = 0; i < words.length; i++){
            long codeword = Long.parseLong(words[i]);
            while(codeword != 0){
                short ascii = (short)(codeword % 1000);
                if(ascii > 127){
                    decodeword = (char)(ascii % 100) + decodeword;
                    codeword /= 100;
                }
                else{
                    decodeword = (char)ascii + decodeword;
                    codeword /= 1000;
                }  
            }
            decodedmsg = decodedmsg +  decodeword +" ";
            decodeword = "";
        }
        return decodedmsg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Encoded Message:");
        String code = sc.next();
        String rev = "";
        for (int i=0; i<code.length(); i++)
            rev= code.charAt(i) +rev;
        System.out.println("THE DECODED MESSAGE:\n"+Decode(rev));
        sc.close();
    }
}