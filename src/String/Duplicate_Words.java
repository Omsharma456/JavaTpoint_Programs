package String;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String words[]=s.split(" ");
        for (int i = 0; i < words.length; i++) {
            int count=1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j]="";
                }
            }
            if (count > 1 && words[i] != "") {
                System.out.println(words[i]);
            }
        }
    }
}
