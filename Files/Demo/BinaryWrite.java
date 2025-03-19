import java.io.*;
public class BinaryWrite {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("test.dat");
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeBoolean(false);
            dos.writeByte(1);
            dos.writeChar('A');
            dos.close();
        }catch(Exception e){
            System.out.println("An error occured. "+e);
        }
    }
}
