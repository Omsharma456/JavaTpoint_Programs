package Basics;

import java.util.Arrays;

public class Ascending_sorting_array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 3, 5, 8, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
