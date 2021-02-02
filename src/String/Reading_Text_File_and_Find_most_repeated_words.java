package String;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Reading_Text_File_and_Find_most_repeated_words {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        FileReader myfile = new FileReader("src/String/file/filereader.txt");
        BufferedReader file = new BufferedReader(myfile);
        String[] str=file.readLine().split(" ");
        System.out.println(Arrays.toString(str));
        int max=0;
        int index=0;
        for(int i=0; i<str.length; i++){
            int count=0;
            for(int j=i+1; j<str.length; j++){
                if(str[i].equals(str[j]) && str[i]!=" "){
                    count++;
                    str[j]=" ";
                }
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        System.out.println("Most repeated Word: " +str[index]);
    }
}
