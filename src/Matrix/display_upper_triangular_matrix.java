package Matrix;

import java.util.Scanner;

public class display_upper_triangular_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & matrix with same value: ");
        int rows=sc.nextInt();
        int[][] arr = new int[rows][rows];
        System.out.println("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
                if (i != j && i < j) {
                    arr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
