package String;

import java.util.Scanner;

public class Duplicate_Character_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int arr[] = new int[150];
        for (int i = 0; i < s.length(); i++) {
            int ascii=(int)s.charAt(i);
            arr[ascii]++;
        }
        System.out.print("Duplicate Characters: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >1) {
                System.out.print((char)i+" ");
            }
        }
    }
}
