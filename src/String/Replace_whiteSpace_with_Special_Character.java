package String;

import java.util.Scanner;

public class Replace_whiteSpace_with_Special_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String(sc.nextLine());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.print('-');
            }else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
