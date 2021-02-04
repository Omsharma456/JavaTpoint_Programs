package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Array_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int a  = sc.nextInt();
        int[][] arr = new int[a][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("no of element in "+(i+1)+" Column: ");
            arr[i] = new int[sc.nextInt()];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
