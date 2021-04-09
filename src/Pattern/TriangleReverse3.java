/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
package Pattern;

import java.util.Scanner;

public class TriangleReverse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int play = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= play; j++) {
                if (j == play) {
                    play--;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


}
