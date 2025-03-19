/*
The names of teams participating in a competition should be displayed 
on a banner vertically, to accomodate as many teams as possible in a single banner.
Design a program to accept the name of N teams, where 2<N<9 and display them
in a vertical order, side by side with a horizontal tab (i.e. eight spaces).
Test your program for the following data and some random data:
Example 1:
INPUT: N=3
Team 1: Emus
Team 2: Road Rols
Team 3: Coyote

OUTPUT:
E	R	C	
m	o	o	
u	a	y	
s	d	o	https://prod.liveshare.vsengsaas.visualstudio.com/join?A028566A92356D949DEBC3212A0B0F553201

	 	t	
	R	e	
	o		
	l		
	s
	
Example 2:

INPUT: N=4
Team 1: Royal
Team 2: Mars
Team 3: De Rose
Team 4: Kings

OUTPUT:
R	M	D	K	
o	a	e	i	
y	r	 	n	
a	s	R	g	
l		o	s	
		s		
		e

Example 3:
INPUT: N=10

OUTPUT:
INVALID INPUT
 */
import java.util.*;
class VerticalBanner{
	public static void banner(String a[]){
		String banner = "";
		int max = a[0].length();
		for(int i = 0; i < a.length; i++){
			if(a[i].length() > max) max = a[i].length();
		}
		for(int i = 0; i < max; i++){
			for(int j = 0; j < a.length; j++){
				if(i < a[j].length())
					banner = banner + a[j].charAt(i) + "\t";
				else
					banner = banner + "\t";
			}
			banner = banner + "\n";
		}
		System.out.println(banner);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of teams");
		int N = sc.nextInt();
        sc.nextLine();
		if(N > 2 && N < 9){
			String teams[] = new String[N];
			for(int i = 1; i <= N; i++){
				System.out.println("Team " + i + ": ");
				teams[i - 1] = sc.nextLine();
			}
			banner(teams);
		}
		else
			System.out.println("Invalid input");
		sc.close();
	}
}