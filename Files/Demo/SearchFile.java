import java.io.*;
public class SearchFile {
    public static void main(String[] args) {
        String item="USA";
        String filename="test.txt";
        boolean found=false;
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while((line=br.readLine())!=null){
                if(line.equals(item)){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("Item found");
            }else{
                System.out.println("Item not found");
            }
            br.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}