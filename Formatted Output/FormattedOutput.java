class FormattedOutput{
    public static void main(String[] args) {
        int n1=-123,n2=23;

        System.out.printf("N = %+d%n",n1);             // %d - Decimal number   %n-  newline
        System.out.printf("N = %10d%n",n1);
        System.out.printf("N = %10d%n",n2);

        double n3=2.345f,n4=23.56f;

        System.out.printf("N = %+10.2f%n",n3);        // %f - Float
        System.out.printf("N = %10.2f%n",n4);
        System.out.printf("%10s%n","India"); // %s - String
    }
}