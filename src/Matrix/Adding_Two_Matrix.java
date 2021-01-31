package Matrix;

import java.util.Scanner;

class Adding_Two_Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: ");
        int rows=sc.nextInt();
        System.out.print("enter column: ");
        int column=sc.nextInt();
        int[][] arr1=new int[rows][column];
        int[][] arr2=new int[rows][column];
        int[][] arr3=new int[rows][column];
        System.out.println("Enter elements on arr1 :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements on arr2 :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
