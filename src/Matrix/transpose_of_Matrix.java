package Matrix;

import java.util.Scanner;

public class transpose_of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter column: ");
        int col=sc.nextInt();
        System.out.println("Enter values");
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transpose");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
