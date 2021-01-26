package Basics;

public class Third_Largest_Number_In_Array {
    public static void main(String[] args) {
        int[] myarr = new int[]{1, 3, 4, 56, 43, 2};
        int thirdmax=0;
        for (int i = 0; i < myarr.length; i++) {
            for (int j = i + 1; j < myarr.length; j++) {
                if (myarr[i] > myarr[j]) {
                    int temp = myarr[i];
                    myarr[i] = myarr[j];
                    myarr[j]=temp;
                }
            }
        }
        System.out.println(myarr[myarr.length-3]);
    }
}
