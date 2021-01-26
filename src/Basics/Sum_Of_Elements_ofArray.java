package Basics;

public class Sum_Of_Elements_ofArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 45, 3, 5, 3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Total Sum: "+sum);
    }
}
