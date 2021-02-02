package String;
import java.io.*;
public class Number_of_words_in_File {
    public static void main(String[] args) throws Exception {
        FileReader myfile = new FileReader("src/String/file/filereader.txt");
        BufferedReader file = new BufferedReader(myfile);
        String[] str=file.readLine().toLowerCase().split(" ");
        System.out.println("Total Length: "+str.length);
    }
}
