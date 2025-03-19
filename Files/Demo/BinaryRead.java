import java.io.*;
public class BinaryRead {
    public static void main(String[] args) {
        try{
        FileInputStream fis=new FileInputStream("test.dat");
        DataInputStream dis=new DataInputStream(fis);
        System.out.println(dis.readBoolean());
        System.out.println(dis.readByte());
        System.out.println(dis.readChar());
        fis.close();
        }catch(Exception e){
            System.out.println("An error has occured."+e);
        }
    }
}
