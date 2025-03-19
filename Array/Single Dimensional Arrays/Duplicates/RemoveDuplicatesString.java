import java.util.Arrays;

public class RemoveDuplicatesString {
        public static String[] removeDuplicates(String b[]){
            String a[]=b.clone();
            int end = a.length;
            for(int i=0; i<end;i++){
                for(int j=i+1; j<end;j++){
                    if(a[i]==a[j]){
                        a[j]=a[end-1];
                        end--;
                        j--;
                    }
                }
            }
            String []unique = new String[end];
            for(int i=0;i<end;i++){
                unique[i]=a[i];
            }
            return unique;
        }
        public static void main(String[] args) {
            String a[]={"Idhant","Veer","Vedansh","Idhant","Veer","Veer"};
            String b[] = removeDuplicates(a);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
    
}
