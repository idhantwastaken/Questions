/* 
A sentence is terminated by either “ . ” , “ ! ” or “ ? ” followed by a
space. Input a piece of text consisting of sentences. Assume that there
will be a maximum of 10 sentences in block letters.

Write a program to:
(i) Obtain the length of the sentence (measured in words) and the
frequency of vowels in each sentence.

(ii) Generate the output as shown below using the given data.

Sample data:

INPUT: HELLO! HOW ARE YOU? HOPE EVERYTHING IS FINE. BEST OF LUCK.

OUTPUT
Sentence   No. of Vowels   No. of words
1          2              1
2          5              3
3          8              4
4          3              3


Sentence    No. of vowels / words
1           VVVVVV
            WWW
2           VVVVVVVVVVVVVVV
            WWWWWWWWW
3           VVVVVVVVVVVVVVVVVVVVVVVV
            WWWWWWWWWWWW
4           VVVVVVVVV
            WWWWWWWWW

Scale used 1:3 
*/
import java.util.*;
public class VowvelsAndConsonants {
    static String graph = "Sentence    No. of vowels / words";
    public static void barGraph(int vowels, int n){
        graph += "\t    ";
            while(vowels != 0){
                graph += "V";
                vowels--;
            }
            graph += "\n\t    ";
            while(n != 0){
                graph += "W";
                n--;
            }
    }
    public static void vowelsandwords(String a){
        String sentences[] = a.split("[.,!?]");
        int vowels = 0, words = 1;
        System.out.println("Sentence   No. of Vowels   No. of words");
        for(int i = 0; i < sentences.length; i++){
            for (int j = 0; j < sentences[i].length(); j++) {
                sentences[i] = sentences[i].toUpperCase();
                char ch = sentences[i].charAt(j);
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') vowels++;
                if(ch == ' ') words++;
            }
            graph += "\n"+i;
            barGraph(vowels * 3, words * 3);
            System.out.println(i+"\t\t"+vowels+"\t\t"+words+"\t\t");
            vowels = words = 0;
        }
        System.out.println(graph + "\nScale used 1:3");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Sentences");
        String str = sc.nextLine();
        vowelsandwords(str);
        sc.close();
    }
}