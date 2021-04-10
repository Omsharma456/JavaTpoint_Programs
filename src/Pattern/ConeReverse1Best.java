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

public class ConeReverse1Best {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*__");
            }
            System.out.println();
        }
    }
}
