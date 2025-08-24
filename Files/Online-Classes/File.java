/**
* Write a program to create a file data.txt, input and store n sentences in it
*/
import java.util.*;
import java.io.*;
public class File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("data.txt")));
        
        System.out.println("Enter the no. of sentences");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            pw.println(str);
        }
        pw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}