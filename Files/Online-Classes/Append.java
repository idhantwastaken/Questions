/*
* wap to append data.txt with new sentences till the user wants to stop
*/

import java.util.*;
import java.io.*;
public class Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("data.txt", true)));
            System.out.println("Enter sentences to be added. (Enter 0 to stop entering)");
            boolean will = true;
            
            while (will) {
                String s = sc.nextLine();
                if(s == "0"){
                    will = false;
                    break;   
                }
                pw.println(s);
            }
            
            pw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}