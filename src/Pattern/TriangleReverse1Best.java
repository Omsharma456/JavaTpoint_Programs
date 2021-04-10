/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
package Pattern;

import java.util.Scanner;

public class TriangleReverse1Best {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {  //here we can also do it with start j = 1; j <= n-i; j++
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
