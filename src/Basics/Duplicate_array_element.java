package Basics;

import java.util.Scanner;

public class Duplicate_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter values");
        int[] ar = new int[size];
        for (int i = 0; i<ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        int[] ans = new int[100];
        for(int i =0;i<ar.length;i++){
            int a = ar[i];
            ans[a]++;
        }
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]>1){
                System.out.println(i);
            }
        }
    }
}
