import java.util.*;
class ArrayDemo{
    public static void main(String[] args) {
        int a[]={100,200,300,400,500}; // static allocation
        System.out.println(a);
        System.out.println("Length: "+a.length);
        for(int i=0; i<a.length;i++){// array traversal
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int value:a){  // enhanced for (elements cannot be modified)
            System.out.print(value+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));

        int b[]=new int[5]; // dynamic array
        for(int i=0; i<b.length;i++){
            b[i]=(i+1)*100;
        }
        System.out.println(Arrays.toString(b));

    }
}