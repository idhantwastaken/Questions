/*
A company manufactures packing cartons in four sizes, i.e. cartons to 
accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes. 
Design a program to accept the number of boxes to be packed (N) by the 
user (maximum up to 1000 boxes) and display the break-up of the cartons 
used in descending order of capacity (i.e. preference should be given to 
the highest capacity available, and if boxes left are less than 6, an extra 
carton of capacity 6 should be used.)

Test your program with the sample data and some random data:

Example 1

INPUT : N = 726

OUTPUT :
                48 x 15 =  720
                 6 x  1 =    6
Remaining boxes         =    0
Total number of boxes   = 726
Total number of cartons = 16

Example 2

INPUT: N = 140

OUTPUT:
                 48 X 2 =   96
                 24 x 1 =   24
                 12 x 1 =   12
                  6 x 1 =    6
Remaining boxes   2 x 1 =    2
Total number of boxes   =  140
Total number of cartons = 6

Example 3

INPUT : N = 4296

OUTPUT : INVALID INPUT
 */
import java.util.*;

class Cartoon{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of boxes to be packed");
        int N = in.nextInt();
        if (N >= 1000) {
            System.out.println("Invaild input");
        } else {
            int carton[] = { 48, 24, 12, 6 };
            int count = 0;
            int quantity = N;
            int totalCartons = 0;
            for (int i = 0; i < 4; i++) {
                if (N >= carton[i]) {
                    count = quantity / carton[i];
                    if (count > 0) {
                        System.out.printf("\t\t\t\t%4d x %4d = %4d%n",carton[i],count,(count * carton[i]));
                    }
                    quantity = quantity % carton[i];
                    totalCartons += count;

                }

            }
            if (quantity == 0)
                System.out.printf("%-43s = %4d%n","Remaining boxes",quantity);
            else
                System.out.printf("%-31s %4d x %4d = %4d%n","Remaining boxes",quantity,1,quantity);
            System.out.printf("%-43s = %4d%n","Total number of boxes",N);
            System.out.printf("%-43s = %4d%n","Total number of cartons",totalCartons);
        }
        in.close();
    }
}
