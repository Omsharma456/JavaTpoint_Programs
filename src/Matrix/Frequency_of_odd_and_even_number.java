package Matrix;

import java.util.Scanner;

public class Frequency_of_odd_and_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int col = sc.nextInt();
        int oddcount=0;
        int evencount=0;
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
                if (arr[i][j] % 2 == 0) {
                    evencount++;
                }
                else {
                    oddcount++;
                }
            }
        }
        System.out.println("Total odd Frequency: " + oddcount);
        System.out.println("Total even Frequency: " + evencount);
    }
}
