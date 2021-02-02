package String;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Smallest_and_biggest_possible_palindrome_in_string {
    public static void main(String[] args) throws Exception{
        FileReader myfile = new FileReader("src/String/file/palindrome.txt");
        BufferedReader file=new BufferedReader(myfile);

        String[] str=file.readLine().split(" ");
        int maxlength=0;
        int minlength=str[0].length();
        for(int i=0; i<str.length; i++){
            boolean flag=true;
            int length=str[i].length()-1;
            final int lengthofWord=length;
            for (int j=0; j<str[i].length(); j++){
                if (str[i].charAt(j) != str[i].charAt(length)) {
                    flag=false;
                    break;
                }
                length--;
            }
            if (flag == true && lengthofWord>maxlength) {
                maxlength=lengthofWord;
                System.out.println("Biggest Palindrome: "+str[i]);
            }
            if(flag == true && lengthofWord<minlength){
                minlength=lengthofWord;
                System.out.println("Smallest Palindrome: "+str[i]);
            }
        }
    }
}
