package Pattern;

import java.util.Scanner;

public class flagPatternBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = (n * 2) - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int remaining = total - n + 1;
        for (int k = 1; k <= remaining; k++) {
            for (int l = 1; l <= remaining - k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
