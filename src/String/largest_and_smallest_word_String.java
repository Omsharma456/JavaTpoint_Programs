package String;

import java.util.Scanner;

public class largest_and_smallest_word_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int maxlength=0;
        int maxindex=0;
        int minlength=s[0].length();
        int minindex=0;
        for(int i=0; i<s.length; i++){
            if(s[i].length()>maxlength){
                maxlength=s[i].length();
                 maxindex=i;
            }
            if(s[i].length()<minlength){
                minlength=s[i].length();
                minindex=i;
            }
        }
        System.out.println(s[maxindex]);
        System.out.println(s[minindex]);
    }
}
