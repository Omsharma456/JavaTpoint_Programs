package Basics;

import java.util.Scanner;

public class demofrequency {
    public static void main(String[] args) {
        int[] ar = {1,2,3,2,1,3,1,5};
        int[] ans = new int[100000];
        for(int i =0;i<ar.length;i++){
            int a = ar[i];
            ans[a]++;
        }
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]>0){
                System.out.println(i+" times repeat "+ans[i]);
            }
        }
    }
}
