import java.io.*;
public class CreateDemo{
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write("1");
            fw.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}