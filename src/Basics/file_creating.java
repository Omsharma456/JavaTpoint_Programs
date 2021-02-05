import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class file_creating {
    public static void main(String[] args) throws FileNotFoundException {
        File myfile=new File("zara.txt");
        System.out.println(myfile.exists());
        if(myfile.exists()==true)               //check that file is created or not.
        {
            System.out.println("Our file is created");
            PrintWriter pw=new PrintWriter(myfile);     //for writting something in file
            pw.println("Hello this my first creation of file through Java");
            pw.println(10+20);
            pw.close();                                 //closing the writting
        }
        else
        {
            System.out.println("Our file is not created");
        }
    }
}
