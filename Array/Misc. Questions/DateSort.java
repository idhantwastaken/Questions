import java.util.*;

public class DateSort {
    public static void bubbleSortAsc(int a[]) {
        int temp;
        // int count = 0;
        boolean swapped;
        for (int pass = 0; pass < a.length - 1; pass++) {
            swapped = false;
            for (int curr = 0; curr < a.length - 1 - pass; curr++) {
                // count++;
                if (a[curr + 1] < a[curr]) {
                    temp = a[curr + 1];
                    a[curr + 1] = a[curr];
                    a[curr] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        // System.out.println("Inner loop ran " + count + " times.");
    }

    public static void sortDates(String dt[]) {
        // 16/01/2024 => 20240116
        // 0123456789
        int iDate[] = new int[dt.length];
        for (int i = 0; i < dt.length; i++) {
            iDate[i] = Integer.parseInt(dt[i].substring(6) + dt[i].substring(3, 5) + dt[i].substring(0, 2));
        }
        bubbleSortAsc(iDate);
        int d, m, y;
        for (int i = 0; i < dt.length; i++) {
            d=iDate[i]%100;
            m=(iDate[i]/100)%100;
            y=iDate[i]/10000;
            dt[i]=(d<10?"0":"")+d+"/"+(m<10?"0":"")+m+"/"+y;
        }
    }

    public static void main(String[] args) {
        String[] dates = {"16/01/2024", "01/11/2024", "13/11/2024", "30/08/1942", "05/03/2024", "25/11/2024",
                "10/06/2024", "17/12/2024", "28/11/2002", "19/01/2024", "22/03/2024", "01/05/2024", "13/02/2024",
                "19/12/2024", "19/10/2024", "18/09/2024", "31/05/2024", "09/03/2024", "10/02/2024", "13/08/2019"};
        System.out.println(Arrays.toString(dates));
        sortDates(dates);
        System.out.println(Arrays.toString(dates));
    }
}