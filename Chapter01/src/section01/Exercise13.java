package section01;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise13 {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
