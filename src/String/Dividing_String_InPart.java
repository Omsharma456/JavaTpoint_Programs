package String;

import java.util.Scanner;

public class Dividing_String_InPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        int n=3;
        int temp=0;
        int divider = len / n;
        String[] equalStr = new String[n];
        if (len % n != 0) {
            System.out.println("Sorry this String can't be divided" + n + " length");
        }
        else {
            for (int i = 0; i < len; i = i + divider) {
                String part = s.substring(i, i + divider);
                equalStr[temp]=part;
                temp++;
            }
            System.out.println(n + " equal parts of given string are ");
            for(int i = 0; i < equalStr.length; i++) {
                System.out.println(equalStr[i]);
            }
    }

    }
}
