package Pattern;

import java.util.Scanner;

public class ConeNumber1Bad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("__");
            }

            while (j <= n) {
                System.out.print(number + "__");
                number += 2;
                j++;
            }
            System.out.println();
        }
    }
}
