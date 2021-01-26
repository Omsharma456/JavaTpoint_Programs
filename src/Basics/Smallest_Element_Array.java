package Basics;

public class Smallest_Element_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 78, 3};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                max=arr[i];
            }
        }
        System.out.println("min element in array: "+max);
    }
}
