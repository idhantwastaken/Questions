
/*
Write a Java program to generate and display a horizontal bar graph in text mode based on a given set of integer data.

Requirements:

   1.    The program should take an array of integers as input.
   2.    Each integer in the array represents the frequency of occurrences of a particular category.
   3.    The bar graph should be displayed in text mode using # characters to represent the frequency.
   4.    The x-axis should represent the frequencies, and the y-axis should represent the categories.
   5.    The program should properly label the x-axis and y-axis for clarity.

Constraints:
   •    The input array will contain non-negative integers only.
   •    The maximum value in the input array will not exceed 2000 for simplicity.
   •    The program should handle up to 10 categories.

Sample Input:
int[] data = {3, 7, 1, 5, 10, 2, 6};


Sample Output:

Category 0 | ###
Category 1 | #######
Category 2 | #
Category 3 | #####
Category 4 | ##########
Category 5 | ##
Category 6 | ######
Frequency  | 0 1 2 3 4 5 6 7 8 9 10

Example Description:
Given the input array {3, 7, 1, 5, 10, 2, 6}, the program should generate a horizontal bar graph where each category (0 to 6) has a corresponding number of # characters representing its frequency. The x-axis ranges from 0 to the maximum value in the array (10 in this case), and each row of the bar graph corresponds to the frequency count for that category.
y=f(x)
L<=y<=H
M<=y'<=N
   y' = (y-L) / (H-L) * (N-M) + M



 */
public class Graph {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 1, 5, 10, 2, 6 };
        int L, H, M = 1, N = 130;
        L = H = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < L)
                L = arr[i];
            if (arr[i] > H)
                H = arr[i];
        }
        // System.out.println(L+"->"+H);
        int yprime;
        for (int i = 0; i < arr.length; i++) {
            yprime = (int)((float)(arr[i]-L) / (H-L) * (N-M)+M);
            System.out.print("Category " + i + " | ");
            for(int x=1; x<=yprime;x++){
                System.out.print("#");
            }
            System.out.println(" "+arr[i]);
        }

    }

}
