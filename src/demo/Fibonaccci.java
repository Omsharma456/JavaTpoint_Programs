package demo;

import java.util.Scanner;

public class Fibonaccci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        for (int i = 0; i < n; i++) {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }

    }
}
