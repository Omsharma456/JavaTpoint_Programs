import java.util.Scanner;

public class myswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for add\nEnter 2 for sub\nEnter 3 for mul\nEnter 4 for div");
        int k=sc.nextInt();
        System.out.println("Enter two numbers");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        switch (k)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("You are mad");
        }
    }
}
