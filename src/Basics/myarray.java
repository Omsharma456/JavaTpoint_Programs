public class myarray {
    //There are different types of declaring arrays.
    public static void main(String[] args) {
        int[] arr={1,4,6,7};
        int[] arr3=new int[]{2,4,5,8};
        int[] arr2=new int[5];      //These four ways we can declare an array.
        System.out.println(arr[3]);
        System.out.println(arr3[2]);
        for(int index=0; index<3; index++)
        {
            System.out.print(arr3[index]+" ");
        }
    }
}
