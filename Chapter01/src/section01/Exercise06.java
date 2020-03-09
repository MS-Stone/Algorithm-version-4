package section01;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise06 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for(int i = 0; i < 15; i++) {
            System.out.println(f);
            f += g;
            g -= f;
        }
    }
}
