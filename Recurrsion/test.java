public class test {
    
    public void numbers (int n) 
    {
        if (n > 0)
        {
            System.out. print(n + " " );
            numbers (n-2);
            System.out.print(n + " ");
        }
    }
    public String numbers1(int n)
    {
        if (n <= 0)
        return " ";
        return numbers1(n-1) + n + " ";
    }
    
    public static void main(String[] args) {
        test obj = new test();
        obj.numbers(5);
        System.out.println(obj.numbers1(6));
    }
}
