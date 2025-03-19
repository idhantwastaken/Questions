
/*
Code Validation

A new advanced Operating System, incorporating the latest hi-tech features has 
been designed by Opera Computer Systems.

The task of generating copy protection codes to prevent software piracy has 
been entrusted to the Security Department.

The Security Department has decided to have codes containing a jumbled 
combination of alternate uppercase letters of the alphabet starting 
from A upto K (namely among A,C,E,G,I,K). 
A B C D E F G H I J K
A C E G I K     

The code may or may not be in the consecutive series of alphabets.

Each code should not exceed 6 characters and there should be no repetition of 
characters. If it exceeds 6 characters, display an appropriate error message.

Write a program to input a code and its length. 
At the first instance of an error display invalid!” stating the appropriate reason. 
In case of no error, display the message “Valid!”.

Test your program for the following data and some random data.

SAMPLE DATA
INPUT:  N = 4
ABCE
OUTPUT:
Invalid! Only alternate letters permitted!

INPUT:  N = 4
AcIK
OUTPUT:
Invalid! Only upper case letters permitted!

INPUT:  N = 4
AAKE
OUTPUT:
Invalid! Repetition of characters not permitted!

INPUT:  N = 7
OUTPUT:
Error! Length of string should not exceed 6 characters!

INPUT:  N = 4
AEGIK
OUTPUT:
Invalid! String length not the same as specified!

INPUT:  N = 3
ACE
OUTPUT:
Valid!

INPUT:  N = 5
GEAIK
OUTPUT:
Valid!
 */
import java.util.*;

class CodeValidation {

    public static void main(String Args[]) {
        String validCharacters = "ACEGIKacegik";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of code: ");
        int N = sc.nextInt();
        boolean isValid = true;

        if (N <= 6) {
            System.out.print("Enter the code: ");
            String code = sc.next();
            if (code.length() == N) {
                int foundAtPosition;
                for (int i = 0; i < code.length(); i++) {
                    foundAtPosition = validCharacters.indexOf(code.charAt(i));
                    if (foundAtPosition == -1) {
                        System.out.println("Invalid! Only alternate letters permitted!");
                        isValid=false;
                        break;
                    } else if (foundAtPosition > 5) {
                        System.out.println("Invalid! Only upper case letters permitted!");
                        isValid=false;
                        break;
                    } else if (code.lastIndexOf(code.charAt(i)) != i) {
                        System.out.println("Invalid! Repetition of characters not permitted!");
                        isValid=false;
                        break;
                    }
                }
                if(isValid) System.out.println("Valid!");
            } else
                System.out.println("Invalid! String length not the same as specified!");
        } else
            System.out.println("Error! Length of string should not exceed 6 characters!");
            sc.close();
        
    }

}