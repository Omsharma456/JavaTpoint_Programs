package Basics;

public class FibonacciSeries_With_Recursion {
    static int n1=0,n2=1,n3=0;
    public static void fibonacci(int length) {
        if (length > 0) {
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
            fibonacci(length-1);
        }
    }

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);
        fibonacci(10);
    }
}
