package Basics;

public class Prime_Number {
    static int check=0;
    public static void Prime(int number) {
        if (number == 0 || number == 1) {
            System.out.println(number+" Not Prime");
        }
        else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + " Not Prime");
                    check=1;
                    break;
                }
            }
            if(check==0)
            System.out.println(number+" Prime");
        }
    }

    public static void main(String[] args) {
        Prime(47);
    }
}
