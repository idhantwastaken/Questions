/*
Write a program to enter a string and find the nearest vowel to each consonant in the string. 
If there are two vowels at the same distance, consider the first one. 
If there is no vowel at the same distance, consider the vowel which is nearest to the consonant. 
If there is no vowel in the string, print "No vowels found".
Example:
Input:
hello
Output:
Nearest vowel to 'h' is 'e'
Nearest vowel to 'l' is 'e'
Nearest vowel to 'l' is 'e'
*/

import java.util.*;
class NearestVowel{
    public static boolean isVowel(char c){
        c = Character.toUpperCase(c);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!isVowel(ch)){
                for (int j = 1; j < str.length(); j++) {
                    char ch1 = ' ', ch2 = ' ';
                    int distance_from_front = 0, distance_from_behind = 0; 
                    if(i + j < str.length()){ //Checking ahead of selected char
                        ch1 = str.charAt(i + j);
                        if(isVowel(ch1))
                            distance_from_front = j;
                        else ch1 = ' ';
                    }
                    if(i - j > 0){ //Checking behind selected char
                        ch2 = str.charAt(i - j);
                        if(isVowel(ch2))
                            distance_from_behind = j;
                        else ch2 = ' ';
                    }
                    if(distance_from_behind != 0 || distance_from_front != 0){
                        if(distance_from_behind < distance_from_front)
                            System.out.printf("Nearest vowel to '%c' is '%c' %n",str.charAt(i), ch2);
                        else if(distance_from_behind == distance_from_front){

                        }
                        else
                            System.out.printf("Nearest vowel to '%c' is '%c' %n",str.charAt(i), ch1);
                        break;
                    }
                }
            }
        }
        
        sc.close();
    }
}