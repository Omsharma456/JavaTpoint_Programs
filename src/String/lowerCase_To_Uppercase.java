package String;

import java.util.Locale;
import java.util.Scanner;

public class lowerCase_To_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().toUpperCase(Locale.ROOT);
        System.out.println(s);
    }
}
