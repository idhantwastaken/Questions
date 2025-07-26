import java.io.*;
public class ReadDemo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("test.txt");
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print(ch);
            }
            System.out.println();
            fr.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}
