import java.util.Arrays;

public class Lucy {
    
    int[] removeEveryKth(int[] arr, int lim, int k) {
    int[] result = new int[lim - lim / k];
    int idx = 0;
    for (int i = 0; i < lim; i++) {
        if ((i + 1) % k != 0) {
            result[idx++] = arr[i];
        }
    }
    return result;
}
    
    public static void main(String[] args) {
        Lucy ob = new Lucy();
        int lim = 10;
        int[] arr = new int[lim];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
        

        int k = 2;
        while (arr.length > k) {
            arr = ob.removeEveryKth(arr, arr.length, k);
            k++;
        }
        arr = ob.removeEveryKth(arr, arr.length, k);
        System.out.println(Arrays.toString(arr));
    }
}