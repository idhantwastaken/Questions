/*
 * Write a program to read a given file and display the frequency table of 
 * each alphabet in the file. The program should ignore the case of the characters.
 */
import java.io.*;
import java.util.*;
public class FreqTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String name = sc.next();
        try {
            FileReader fr = new FileReader(name);
            int a;
            int frequencyofletters[] = new int[26];
            while ((a=fr.read()) != -1) {
                char ch = Character.toUpperCase((char)a);
                if(Character.isLetter(ch)) {
                    frequencyofletters[ch - 'A']++;
                }
            }
            for (char i = 'A'; i <= 'Z'; i++) {
                if(frequencyofletters[i - 'A']>0)
                System.out.println(i + ": " + frequencyofletters[i - 'A']);
            }
            fr.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("An Error Occurred" + e);
        }
    }
}
