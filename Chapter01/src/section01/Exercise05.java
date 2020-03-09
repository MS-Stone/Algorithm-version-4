package section01;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise05 {
    public static void main(String[] args) {
        double v = StdIn.readDouble();
        if(v > 0.0 && v < 1.0) System.out.println("true");
        else System.out.println("false");
    }
}
