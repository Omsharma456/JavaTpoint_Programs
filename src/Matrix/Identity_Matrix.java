package Matrix;

import java.util.Scanner;

public class Identity_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is square matrix \nEnter row/column :");
        int row_column=sc.nextInt();
        int[][] arr = new int[row_column][row_column];
        System.out.println("Enter values");
        for (int i = 0; i < row_column; i++) {
            for (int j = 0; j < row_column; j++) {
                arr[i][j]=sc.nextInt();
            }
        }for (int i = 0; i < row_column; i++) {
            for (int j = 0; j < row_column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean flag=true;
        int n=row_column-1;
        while (n!=-1) {
            if (arr[n][n] != 1) {
                flag =false;
                break;
            }
            n--;
        }
        if (flag == true) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not Identity Matrix");
        }
    }
}
