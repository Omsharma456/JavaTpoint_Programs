package demo;

import java.util.*;

public class Prime_number_best_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = -1;
        arr[1] = -1;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (arr[i] == 0) {
                for (int j = i + i; j < n; j += i) {
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
