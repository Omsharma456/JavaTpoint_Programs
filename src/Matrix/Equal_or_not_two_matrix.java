package Matrix;

public class Equal_or_not_two_matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 4}, {3, 4, 5}};
        int[][] arr2 = {{1, 2, 4}, {3, 5, 5}};
        int rows1=arr1.length;
        int rows2=arr2.length;
        int col1=arr1[0].length;
        int col2=arr2[0].length;
        boolean flag=true;
        if (rows1 != rows2 && col1 != col2) {
            System.out.println("Not Equal Matrix");
        }else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        flag=false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("Matrix are Equal");
            }
            else {
                System.out.println("NOot Equal Matrix");
            }
        }
    }
}
