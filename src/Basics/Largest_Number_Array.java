package Basics;

public class Largest_Number_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 78, 3};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println("max element in array: "+max);
    }
}
