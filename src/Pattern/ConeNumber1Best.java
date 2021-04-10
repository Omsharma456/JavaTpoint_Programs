/*
pattern
________1__
______3__5__
____7__9__11__
__13__15__17__19__
21__23__25__27__29__

 */
package Pattern;

import java.util.Scanner;

public class ConeNumber1Best {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + "__");
                number += 2;
            }
            System.out.println();
        }
    }
}
