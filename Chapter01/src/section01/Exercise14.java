package section01;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise14 {
    public static void main(String[] args) {
        final int N = 16;
        int i = 0;
        for(int n = N; n > 0; n /= 2) {
            i++;
        }
        System.out.println(i-1);
    }

}
