package String;
import java.util.Scanner;

public class Max_Min_Character_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        int[] arr = new int[150];
        for (int i = 0; i < s.length; i++) {
            int ascii=(int)s[i];
            arr[ascii]++;
        }
        int max=0;
        int index=0;
        System.out.print("Minimum Occurance: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println((char)i);
            }
            if (arr[i] > max) {
                max=arr[i];
                index=i;
            }
        }
        System.out.println("Maximum Occurance: "+(char)index);
    }

}
