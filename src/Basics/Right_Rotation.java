package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Right_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 3, 4, 5, 7};
        int rotation =sc.nextInt();
        for (int i = 0; i < rotation; i++) {
            int j;
            int last = arr[arr.length-1];
            for (j = arr.length-1; j>=1; j--) {
                arr[j]=arr[j-1];
            }
            arr[j]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
