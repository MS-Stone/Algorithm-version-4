package section01;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise11 {
    public static void main(String[] args) {
        boolean[][] t = new boolean[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                t[i][j] = (i+j)%2 == 1;
            }

        printBooleanMatrix(t);
    }

    public static void printBooleanMatrix(boolean[][] matrix) {
        System.out.print(" ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matrix[i].length; j++) {
                char c = matrix[i][j] ? '*' : ' ';
                System.out.printf("%4c", c);
            }
            System.out.println();
        }
    }
}
