package String;

import java.util.Scanner;

import static java.lang.System.exit;

public class String_is_rotation_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("not rotation");
        }
        else {
            for (int i = 0; i < s1.length(); i++) {
                int find=0;
                for (int j = 0; j < s2.length(); j++) {
                    if(s1.charAt(i)==s2.charAt(j)){
                        find=1;
                    }
                }
                if(find==0){
                    System.out.println("Not rotation");
                    exit(0);
                }
                find=0;
            }
            System.out.println("Rotation of S1");
        }
    }
}
