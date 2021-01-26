package Basics;

public class Odd_And_Even_Number_in_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even is : " + arr[i]);
            } else {
                System.out.println("Odd is : "+arr[i]);
            }
        }
    }
}
