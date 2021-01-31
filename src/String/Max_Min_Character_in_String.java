package String;

import java.util.HashMap;
import java.util.Scanner;

public class Max_Min_Character_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char maxchar=' ';
        char minchar=' ';
        int min=0;
        int max=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max=count;
                maxchar=s.charAt(i);
            }
            count=0;
        }
        System.out.println(maxchar);
    }
}
