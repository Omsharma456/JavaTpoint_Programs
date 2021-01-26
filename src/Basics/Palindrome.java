package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void Palin(int number) {
        int mynum=number;
        int reverse=0;
        int remainder=0;
        while (number > 0) {
            remainder=number%10;
            number/=10;
            reverse=reverse*10+remainder;
        }if (reverse == mynum) {
            System.out.println("This is Basics.Palindrome");
        }
        else {
            System.out.println("This is not Basics.Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number=sc.nextInt();
        Palin(number);
    }
}
