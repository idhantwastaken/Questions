import java.util.*;
class Noofwordparagraph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Paragraph");
        String para = sc.nextLine();
        StringTokenizer ob1 = new StringTokenizer(para, ".!?");
        int noofsentences = ob1.countTokens();
        if(noofsentences > 2 && noofsentences <= 10){
            int arr[] = new int[noofsentences];
            String sentences[] = new String[noofsentences];
            for(int i = 0; i < noofsentences; i++){
                String sent = ob1.nextToken();
                StringTokenizer ob2 = new StringTokenizer(sent);
                arr[i] = ob2.countTokens();
                sentences[i] = sent;
            }
            for (int i = 0; i < arr.length - 1; i++) {
                int pos = i;
                for (int x = i + 1; x < arr.length; x++) {
                    if (arr[x] < arr[pos])
                    pos = x; // update position if curr element is less than the min
                }
                if (pos != i) {
                    int temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                    
                    String temp2 = sentences[i];
                    sentences[i] = sentences[pos];
                    sentences[pos] = temp2;
                }
            }
            System.out.println(Arrays.asList(arr));
            System.out.println(Arrays.toString(sentences));
            sc.close();
        }
    }
}