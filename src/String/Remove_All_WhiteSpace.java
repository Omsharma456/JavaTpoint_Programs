package String;

import java.util.Scanner;

public class Remove_All_WhiteSpace {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            System.out.print(s.charAt(i));
        }
    }
}
