package String;

import java.util.Scanner;

public class Frequency_of_each_character_new_way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[260];
        for(int i=0; i<s.length(); i++){
            int ascii=(int)s.charAt(i);
            arr[ascii]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=1){
                System.out.println((char)i+" ----> "+arr[i]+" times");
            }
        }
    }
}
