package String;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;

import static java.lang.System.exit;

public class Anagram_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        char[] s1=sc.next().toLowerCase().toCharArray();
        System.out.println("Enter second String");
        char[] s2=sc.next().toLowerCase().toCharArray();
        if (s1.length != s2.length) {
            System.out.println("Not Anagram");
            exit(0);
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
         boolean flag=true;
        for (int i = 0; i < s1.length; i++) {
           if (s1[i] != s2[i]) {
                flag=false;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Not Anagram");
        } else {
            System.out.println("Anagram");
        }
    }
}
