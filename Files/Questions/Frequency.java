import java.io.*;
import java.util.Scanner;
class Frequency{
    public static void createFile(String a){
        try{
            FileWriter fw = new FileWriter("C:\\ivaef\\Java\\11-CTS\\11-CTS\\Files\\Questions\\Frequency.txt");
            fw.write(a);
            fw.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
        }
    }

    public static void frequencyOfLetters(){
        try{
            FileReader fr = new FileReader("C:\\ivaef\\Java\\11-CTS\\11-CTS\\Files\\Questions\\Frequency.txt");
            int a, vowel = 0, cons = 0;
            while((a=fr.read())!=-1){
                char ch = Character.toUpperCase((char)a);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel++;
                }
                else cons++;

            }
            System.out.println("Vowel : " + vowel + "\t Consonats: " + cons);
            fr.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String str = sc.nextLine();
        createFile(str);
        frequencyOfLetters();
        sc.close();
    }
}