package String;

import java.util.Scanner;

public class Total_number_of_vowels_and_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int totalvowels=0;
        int totalconsonants=0;
        int totalspace=0;
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                totalspace++;
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (s.charAt(i) == arr[j]) {
                    totalvowels++;
                    break;
                }
            }
        }
            System.out.println("Total vowels in given String : " + totalvowels);
            System.out.println("Total consonants in given String : " + (s.length() - totalvowels-totalspace));
        }}
