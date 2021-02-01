package String;

import java.util.Scanner;

//In O(n^2) Complexity Code
public class frequency_of_each_character_in_String_Old_way {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] s=sc.nextLine().toCharArray();
        for(int i=0; i<s.length; i++){
            int count=1;
            for(int j=i+1; j<s.length; j++){
                if(s[i]==s[j] && s[i]!=' '){
                    count++;
                    s[j]=' ';
                }
            }
            if(count>=1 && s[i]!=' '){
                System.out.println(s[i]+ "-----> "+count);
            }
        }
    }
}
