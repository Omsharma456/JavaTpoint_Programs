import java.util.Scanner;

public class MyString_program {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of String Array: ");
        int n=sc.nextInt();
        String arr1[]=new String[n];
        String arr2[]=new String[n];
        int arr3[]=new int[n];
        System.out.println("String Array1 Starting");
        for(int i=0; i<=n; i++)
        {
            arr1[i]=sc.nextLine();
        }
        System.out.println("String Array2 Starting");
        for(int i=0; i<=n; i++)
        {
            arr2[i]=sc.nextLine();
        }
        for(int k=0; k<=n; k++)
        {
            for(int i=0; i<arr1[k].length(); i++)
            {
                for(int j=0; j<arr2[i].length(); j++)
                {
                    if(arr1[i].charAt(i)!=arr2[j].charAt(j))
                    {
                        count=count+1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
