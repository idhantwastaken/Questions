import java.io.*;
import java.util.*;
class SortWords{
    public static void createFile(String a){
        try{
            FileWriter fw = new FileWriter("C:\\ivaef\\Java\\11-CTS\\11-CTS\\Files\\Questions\\SortWords.txt");
            fw.write(a);
            fw.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
        }
    }

    public static void sortWords(){
        try{
            FileReader fr = new FileReader("C:\\ivaef\\Java\\11-CTS\\11-CTS\\Files\\Questions\\SortWords.txt");
            int a;
            String str = "";
            while((a=fr.read())!=-1){
                char ch = (char)a;
                str = str + ch;
            }
            String sent[] = str.split("., ");
            Arrays.sort(sent);
            for (int i = 0; i < sent.length; i++) {
                System.out.println(sent[i] + "\t");
            }
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
        sortWords();
        sc.close();
    }
}