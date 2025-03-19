import java.util.Arrays;

class ReverseArray{
    public static void reverse(int a[]){
        reverse(a, 0, a.length - 1);
    }
    public static void reverse(int a[], int left, int right){
        if(left < a.length / 2 ){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            // System.out.println(Arrays.toString(a));
            reverse(a, left + 1, right - 1);
        }        }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5,6};
        reverse(a);
        System.out.println(Arrays.toString(a));
        reverse(b);
        System.out.println(Arrays.toString(b));
    }
}