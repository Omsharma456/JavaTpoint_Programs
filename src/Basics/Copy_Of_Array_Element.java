package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Copy_Of_Array_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int length=sc.nextInt();
        int[] myarr = new int[length];
        for (int i = 0; i < myarr.length; i++) {
            System.out.print("Enter "+(i+1)+" element: ");
            int input=sc.nextInt();
            myarr[i]=input;
        }
        int[] mynew=Arrays.copyOf(myarr, length);
        System.out.print("My new Array Elements: ");
        for (int res : mynew) {
            System.out.print(res+" ");
        }
    }
}
