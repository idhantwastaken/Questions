import java.util.*;
import java.io.*;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fo = new FileOutputStream("Invoice.dat");
            DataOutputStream ob = new DataOutputStream(fo);
            System.out.println("Enter no. of prod");
            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < n; i++) {
                System.out.println("Prod Name"); String name = sc.nextLine();
                sc.nextLine();
                System.out.println("No. of Unit"); int unit = sc.nextInt();
                System.out.println("$/Unit"); double price = sc.nextDouble();
                ob.writeUTF(name);
                ob.writeInt(unit);
                ob.writeDouble(price);
            }
            ob.close();
        } catch (Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
