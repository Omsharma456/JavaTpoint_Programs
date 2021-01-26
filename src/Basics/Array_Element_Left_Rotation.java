package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Element_Left_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myarr = new int[]{1, 3, 4, 5, 7, 9, 6};
        System.out.println("Current Array:"+Arrays.toString(myarr));
        System.out.print("Enter left Rotation Steps: ");
        int rotation=sc.nextInt();
        for (int i = 0; i < rotation; i++) {
            int j;
            int first=myarr[0];
            for ( j = 0; j < myarr.length - 1; j++) {
                myarr[j] = myarr[j + 1];
            }
            myarr[j]=first;
        }
        System.out.println("After left rotation: "+Arrays.toString(myarr));
    }
}
