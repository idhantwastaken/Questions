import java.util.*;
import java.io.*;
public class Read {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.printf("Sentence: \t No. of words%n");
            String str;
            while ((str = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str);
                System.out.printf("%s: %d%n", str, st.countTokens());
            }
            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
