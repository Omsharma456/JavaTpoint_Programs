package Basics;

public class Factorial_Using_Recursion {
    public static int factRecursion(int number) {
        if (number == 0) {
            return 1;
        }
        else {
            return number * factRecursion(number - 1);
        }
    }

    public static void main(String[] args) {
        int fact = factRecursion(5);
        System.out.println("Factorial of: "+fact);
    }
}
