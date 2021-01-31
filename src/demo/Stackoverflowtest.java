package demo;

import static java.lang.System.exit;

public class Stackoverflowtest {
    static int count =0;

    public static int noofdigit(int n) {
        if (n >=0) {
            count++;
            return noofdigit(n/10);
        }
        return count;
    }
    public static void main(String[] args) {
        int total = noofdigit(0);
        System.out.println(total);
    }
}
