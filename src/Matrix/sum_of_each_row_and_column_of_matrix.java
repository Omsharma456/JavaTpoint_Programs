package Matrix;

import java.util.Scanner;

public class sum_of_each_row_and_column_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int rows=sc.nextInt();
        System.out.println("enter column: ");
        int col=sc.nextInt();
        int[][] arr = new int[rows][col];
        System.out.println("Enter values");
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
        for (int i = 0; i < rows; i++) {
            int rowsum=0;
            for (int j = 0; j < col; j++) {
                rowsum+=arr[i][j];
            }
            System.out.println("Total sum of row :"+(i+1)+" is :"+rowsum);
        }
        for (int i = 0; i < col; i++) {
            int colsum=0;
            for (int j = 0; j < rows; j++) {
                colsum+=arr[j][i];
            }
            System.out.println("Total sum of column "+(i+1)+" is :"+colsum);
        }
    }
}
