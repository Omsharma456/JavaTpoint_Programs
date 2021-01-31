package Matrix;

import java.util.Scanner;

public class matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int column1_rows2 = sc.nextInt();
        int column2=sc.nextInt();
        int[][] arr1 = new int[rows][column1_rows2];
        int[][] arr2 = new int[column1_rows2][column2];
        int[][] result=new int[rows][column2];
        System.out.println("Enter matrix1 values");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 values");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k<result.length; k++) {
                    result[i][j]+= arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
