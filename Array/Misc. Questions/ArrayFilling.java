import java.util.Arrays;
class ArrayFilling {
    static int[] fillArray(int l) {
        int ar[] = new int[l];
        for (int i = 0; i < l; i++) {
            ar[i] = i + 1;
        }
        int mid = l / 2;
        int input = 2;
        int posi = 1;byte sign = 1;
        if (l % 2 == 1){
            ar[mid] = 1;
        }
        else {
            mid -= 1;
            ar[mid] = 1;
            sign = -1;
        }
        for (int p = 0; p < mid; p++) {
            ar[mid - posi * sign] = input;
            input++;
            
            ar[mid + posi * sign] = input;
            input++;
            posi++;
        }
        return ar;
    }
    public static void main(String[] args) {
        int arr[] = fillArray(5);
        System.out.println(Arrays.toString(arr));
        arr = fillArray(6);
        System.out.println(Arrays.toString(arr));
    }
    
}