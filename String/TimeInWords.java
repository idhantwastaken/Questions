/*
Given a time in numbers we can convert it into words. For example:-
5:00          five o'clock
5:10          ten minutes past five
5:15          quarter past five
5:30          half past five
5:40          twenty minutes to six
5:45          quarter to six
5:47          thirteen minutes to six

Write a program which first inputs two integers, the first between 1 and 12 (both inclusive) and second between 0 and 59 (both inclusive) and then prints out the time they represent, in words. Your program should follow the format of the examples below:-

SAMPLE DATA:
INPUT:
TIME :        3:00
OUTPUT:       3:00           three o'clock

INPUT:
TIME :        7:29
OUTPUT:       7:29           twenty minutes past seven

INPUT:
TIME :        6:34
OUTPUT:       6:34           twenty minutes to seven

INPUT:
TIME :        12:01
OUTPUT:       12:01          one minute past twelve

INPUT:
TIME :        12:45
OUTPUT:       12:45          quarter to 9

INPUT:
TIME :        10:59
OUTPUT:       10:59          one minute to eleven

INPUT:
TIME :        14:60
OUTPUT:       incorrect input

Test your program for the data values given in the examples above and some random data.
*/
import java.util.*;

class TimeInWords {
    public static String convertIntegerToWords(int n) {
        String a = "";
        String arr1[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String arr2[] = { "Twenty", "Thirty", "Forty", "Fifty" };
        
        if(n < 20) a = arr1[n-1];
        else{
            a = arr2[(n / 10) - 2];
        }
        return a;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time");
        String time = in.nextLine();
        String a[]=new String[2];
        a=time.split(":");
        int min=Integer.parseInt(a[1]);
        int hour=Integer.parseInt(a[0]);
        String ans="";
        
        String arr1[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven","Twelve"};
        if(min >= 0 && min < 60 && hour > 0 && hour <= 12){
            if(min == 0) ans = arr1[hour -1] + " o' clock";
            if(min == 15) ans = "quarter past "+arr1[hour];
            if(min == 30) ans = "half past "+arr1[hour];
            if(min == 45) ans = "quarter to "+arr1[hour];
            if(min > 30) ans = convertIntegerToWords(60-min)+" minuets to "+arr1[hour];
            if(min < 30){
                if(min == 1) ans=convertIntegerToWords(min)+" minute past "+arr1[hour-1];
                else ans=convertIntegerToWords(min)+" minute past "+arr1[hour-1];
            }
        }
        else
            System.out.println("Time is Invalid");
        System.out.println(ans);
        in.close();
    }
    
}