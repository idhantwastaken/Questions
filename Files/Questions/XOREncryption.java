import java.io.*;
import java.util.Scanner;
class XOREncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to encrypt");
        String name = sc.next();
        System.out.println("Enter a password.");
        String password = sc.next();
        while (password == "") {
            System.out.println("Password Cannot be empty. Retry");
        }
        try {
            FileReader fr = new FileReader(name);
            FileWriter fw = new FileWriter("Encrypted Text.txt");
            int a, i = 0;
            String encryptedtext = "";
            while ((a=fr.read()) != -1) {
                char ch = (char)a;
                encryptedtext = encryptedtext + (char)(ch ^ password.charAt(i++));
                if(i == password.length()) i = 0;
            }
            fw.write(encryptedtext);
            fw.close();
            fr.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("An Error Occurred: " + e);
        }
    }
}
