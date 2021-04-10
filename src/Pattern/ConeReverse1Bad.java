/*
pattern
_______*__
______*__*__
____*__*__*__
__*__*__*__*__
*__*__*__*__*__

 */
package Pattern;

import java.util.Scanner;

public class ConeReverse1Bad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("__");
            }
            while (j <= n) {
                System.out.print("*__");
                j++;
            }
            System.out.println();
        }
    }
}
