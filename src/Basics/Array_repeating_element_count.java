package Basics;

import java.util.Scanner;

public class Array_repeating_element_count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visited=-1;
        int[] arr = new int[]{1, 2, 4, 5, 3, 2, 2, 5, 4, 3};
        int[] repeatele = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    repeatele[j]=visited;
                }
            }
            if (repeatele[i] != visited) {
                repeatele[i]=count;
            }
        }

        System.out.println("------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("-------------------------");
        for(int i = 0; i < repeatele.length; i++){
            if(repeatele[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + repeatele[i]);
        }
        System.out.println("--------------------------");
    }
}
