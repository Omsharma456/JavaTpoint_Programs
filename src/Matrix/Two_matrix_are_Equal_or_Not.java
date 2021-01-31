package Matrix;

import static java.lang.System.exit;

public class Two_matrix_are_Equal_or_Not {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 4}, {3, 4, 5}};
        int[][] arr2 = {{1, 2, 4}, {3, 5, 5}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    System.out.println("Not Equal");
                    exit(0);
                }
            }
        }
        System.out.println("Equal");
    }
}
