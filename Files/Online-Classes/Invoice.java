import java.io.*;
public class Invoice {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Invoice.dat");
            DataInputStream dis = new DataInputStream(fis);

            boolean eof = false;
            while(!eof) {
                String prod = dis.readUTF();
                int quant = dis.readInt();
                double p = dis.readDouble();

                double tp = p * quant;
                if(tp > 12000) tp = tp - (tp * 0.20);

                System.out.printf("Product:%s%n No. of units:%d%n Price per unit:%f%n Total amount:%f%n", prod, quant, p, tp);
            }

            dis.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
