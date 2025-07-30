/*
Day on a given date & Date validation

Write a program to accept a date in the string format dd/mm/yyyy
and accept the name of the day on 1st of January of the corresponding
year. Find the day for the given date.

Example:    
INPUT
Date                : 5/7/2001
Day on 1st January  : MONDAY
OUTPUT
Day on 5/7/2001     : THURSDAY

Test run the program on the following inputs.

INPUT  DATE          DAY ON  1ST JANUARY        OUTPUT DAY FOR INPUT DATE
4/9/1998             THURSDAY                   FRIDAY
31/8/1999            FRIDAY                     TUESDAY
6/12/2000            SATURDAY                   WEDNESDAY

The program should include the part for validating the inputs namely the date
and the day on 1st January of that year.
*/
import java.util.*;

class DayDate {
    public static boolean isLeapYear(int year) {
        return year % (year % 100 == 0 ? 400 : 4) == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%-20s : ", "Date");
        String date = sc.nextLine();
        System.out.printf("%-20s : ", "Day on 1st January");
        String day = sc.nextLine();
        
        // int d = Integer.parseInt(date.substring(0, date.indexOf("/")));
        // int m = Integer.parseInt(date.substring(date.indexOf("/")+1, date.lastIndexOf("/")));
        // int y = Integer.parseInt(date.substring(date.lastIndexOf("/")));
        
        String part[]=date.split("/");
        int d=Integer.parseInt(part[0]);
        int m=Integer.parseInt(part[1]);
        int y=Integer.parseInt(part[2]);
        
        
        String dayslist[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int numberofdays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if(d > 0 && d < 31 && m > 0 && m < 12 && y > 0){
            if (isLeapYear(y))
            numberofdays[1] = 29;
            
            int sumDays = 0;
            for(int i = 1; i <= m; i++){
                if(i == m)sumDays += d;
                else sumDays += numberofdays[i-1];
            }
            int dayindex = 0;
            for(int i = 0;i < dayslist.length;i++){
                if(dayslist[i].equalsIgnoreCase(day)) 
                dayindex = i;
            }
            System.out.printf("%-10s %-10s: %s%n", "Day on ",date,dayslist[((sumDays%7-1+dayindex) > 7)? (sumDays%7-1+dayindex)-7 : (sumDays%7-1+dayindex)]);
        }
        else System.out.println("Invalid Input");
        sc.close();
    }
}