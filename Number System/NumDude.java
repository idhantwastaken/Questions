import java.util.Scanner;
class NumDude {
    int num;
    public NumDude(){
        num = 0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        sc.close();
    }

    int sumDigit(int x){
        if(x == 0) return 0;
        else return x % 10 + sumDigit(x / 10);
    }

    void isDudeney(){
        if((int)Math.pow(sumDigit(num),3) == num) System.out.println(num + " is a Dudney number");
        else System.out.println(num + " is not a Dudney number");
    }

    public static void main(String[] args) {
        NumDude ob = new NumDude();
        ob.input();
        ob.isDudeney();
    }
}
