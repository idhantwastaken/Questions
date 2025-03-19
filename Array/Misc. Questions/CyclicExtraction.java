/*
You are tasked with creating a Java program that allows the user to input values into a two-dimensional  M \times N  array, and then extracts its elements in a cyclic clockwise spiral order.

The program should:

	1.	Take input for the number of rows  M  and columns  N  of the array.
	2.	Accept  M \times N  integer values from the user to populate the array.
	3.	Extract and display the elements in a cyclic clockwise spiral pattern, starting from the top-left corner and proceeding inward until all elements are displayed.

Example Input:
Enter number of rows (M): 3
Enter number of columns (N): 4

Enter elements of the array:
1  2  3  4
5  6  7  8
9 10 11 12

Example Output:
Array Filled:
1  2  3  4
5  6  7  8
9 10 11 12

Clockwise Spiral Order:
1 2 3 4 8 12 11 10 9 5 6 7

 */
import java.util.*;
public class CyclicExtraction {
	static int M, N;
	public static void clockwisePrint(int a[][]) {
		int p1 = 0, p2 = N - 1, p3 = M - 1, p4 = 0; 
        int product = M * N;
		for (int i = 0; i < product;) {
			for (int left_right = p4; left_right <= p2; left_right++) {
				System.out.print(a[p1][left_right] + " ");
				i++;
			}
			p1++;
			if(i == product) break;
			for (int top_bottom = p1; top_bottom <= p3; top_bottom++) {
				System.out.print(a[top_bottom][p2] + " ");
				i++;
			}
			p2--;
			if(i == product) break;
			for (int right_left = p2; right_left >= p4; right_left--) {
				System.out.print(a[p3][right_left] + " ");
				i++;
			}
			p3--;
			if(i == product) break;
			for (int bottom_top = p3; bottom_top >= p1; bottom_top--) {
				System.out.print(a[bottom_top][p4] + " ");
				i++;
			}
			p4++;
			if(i == product) break;
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		M = sc.nextInt();
		N = sc.nextInt();
		int arr[][] = new int[M][N];
		System.out.println("Enter " + (M * N) + " numbers");
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Clockwise Spiral Order:");
		clockwisePrint(arr);
    	sc.close();
	}
}
