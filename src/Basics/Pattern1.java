package Basics;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("* ");
            }
            System.out.println("\n");
        }
    }
}
