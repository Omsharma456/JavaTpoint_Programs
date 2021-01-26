package Basics;

import java.util.Scanner;

public class Armstrong_Number {
    public static int myarms(int number) {
        int rem=0;
        int mysum=0;
        while (number > 0) {
            rem=number%10;
            mysum += (int) Math.pow(rem, 3);
            number/=10;
        }
        return mysum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int input=sc.nextInt();
        int mysum=myarms(input);
        if(mysum==input) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("not armstrong number");
        }
    }
}
