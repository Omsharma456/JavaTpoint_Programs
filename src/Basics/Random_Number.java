package Basics;

import java.util.Scanner;

public class Random_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=sc.nextInt();
        int max = sc.nextInt();
        System.out.println("Random no: between :"+min+" And "+max);
        System.out.println((int)Math.random() * (max - min + 1) + min);

    }
}
