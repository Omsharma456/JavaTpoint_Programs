package String;

import java.util.Scanner;

public class Palindrome_or_not_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s=sc.nextLine();
        int j=s.length()-1;
        boolean flag=true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j)) {
                flag=false;
            }
            j--;
        }
        if (flag == true) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
