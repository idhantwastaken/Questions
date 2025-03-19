import java.util.Scanner;

class Trip
{
    static double[] Ar = new double[1000];    //Array to store amount paid by n students
    static Scanner sc = new Scanner(System.in);
    int num;
    void accept(int n) {
        num=n;
        if (n <= 1000 && n > 0) {
            System.out.println("Enter the amount paid by each student on the trip");
            for (int i = 0; i < 1000; i++) {
                double amt = sc.nextDouble();
                if (amt == 0)
                    break;
                if (amt > 0 && amt < 10000.00) {
                    amt = (double) ((int) (amt * 100)) / 100;                     //Rounding off to 2 decimal places
                    Ar[i] = amt;
                }
                else
                    System.out.println("Entered amount is invalid");
            }
        }
        else
            System.out.println("Invalid no. of Students. No. of students cannot be more than 1000");
    }

    void calc() {
        double sum = 0, avg = 0, Diff = 0, Diffsum = 0, meanDiff;
        for (int i = 0; i < Ar.length; i++) {    // Calculating average amt paid by each student
            sum = sum + Ar[i];
            avg = sum / num;
        }

        for (int i = 0; i < Ar.length; i++) {
            if (Ar[i] != 0){
                if (Ar[i] > avg)      //Calculating the difference in the amt paid and the avg amt of each student
                    Diff = Ar[i] - avg;
                else
                    Diff = avg - Ar[i];
            }
            else
                Diff = 0.0;
            Diffsum += (double) ((int) (Diff * 100)) / 100;

        }
        meanDiff = ((double) ((int) (Diffsum * 100)) / 100) / 2;
        System.out.println("$" + meanDiff);
    }

    public static void main(String[] args) {
        Trip ob = new Trip();
        System.out.println("Enter the total no. of students on the Trip");
        int a = sc.nextInt();

        ob.accept(a);
        ob.calc();
    }
}