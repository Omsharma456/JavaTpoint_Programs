package Pattern;

import java.util.Scanner;

public class ConeReverse1Bad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}
