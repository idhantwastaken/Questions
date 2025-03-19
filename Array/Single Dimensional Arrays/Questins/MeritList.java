
/*
Write a Java program to create a merit list for a class based 
on the percentage marks obtained by each student.

Description:

The user should first input the number of students, N, in the class.
For each student, the user will enter the student's name and the 
percentage marks obtained.
The program should then generate and display a merit list of students. 
The merit list should be sorted in descending order of the percentage marks.
Constraints:

If two or more students have the same percentage marks, they should 
be given the same rank in the merit list.
The next rank after tied ranks should be adjusted accordingly. 
For example, if two students are tied for rank 1, the next student 
should be ranked as 3.

Input:
An integer N, denoting the number of students.
For each student:
A string representing the student's name.
A floating-point number representing the student's percentage marks.

Output:
The merit list of students in descending order of percentage marks. 
Each line should display the rank, the student's name, and 
their percentage marks.
*/
import java.util.*;

class Meritlist {
    public static void sortList(String a[], float b[]) {
        int pos;
        float temp1;
        String temp2;
        for (int i = 0; i < b.length; i++) {
            pos = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] > b[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                temp1 = b[i];
                b[i] = b[pos];
                b[pos] = temp1;

                temp2 = a[i];
                a[i] = a[pos];
                a[pos] = temp2;
            }

        }
    }
    public static int[] getRank(float per[]){
        int rank[]=new int[per.length];
        int currentRank=1;
        rank[0]=currentRank;
        for(int i = 1; i<rank.length;i++){
                if(per[i]==per[i-1]){
                    rank[i]=currentRank;
                }else{
                    currentRank=i+1;
                    rank[i]=currentRank;
                }
        }


        return rank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students: ");
        int N = sc.nextInt();
        sc.nextLine();

        String name[] = new String[N];
        float percentage[] = new float[N];
        System.out.println("Enter the name and percentage marks of the student");
        for (int i = 0; i < N; i++) {

            name[i] = sc.nextLine();
            percentage[i] = sc.nextFloat();
            sc.nextLine();
        }
        sortList(name, percentage);
        int rank[]=getRank(percentage);

        System.out.println("Name\tPercentage\tRank");
        for(int i=0; i<N;i++){
            System.out.println(name[i]+"\t"+percentage[i]+"\t\t"+rank[i]);
        }
        sc.close();
    }
}