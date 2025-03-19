public class SortedTest {
    public static boolean isSortedAscencding(int a[]){
        return isSortedAscencding(a, 1);
    }
    public static boolean isSortedAscencding(int a[], int current){
        if(current < a.length){
            if(a[current - 1] > a[current])
                return false;
            else return isSortedAscencding(a, current + 1);
        }
        else return true;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(isSortedAscencding(a));//true
        int b[]={1,2,3,5,4};
        System.out.println(isSortedAscencding(b));//false
    }
}
