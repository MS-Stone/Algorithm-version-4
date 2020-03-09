package section01;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise03 {
    public static void main(String[] args) {
        int first = StdIn.readInt();
        int second = StdIn.readInt();
        int third = StdIn.readInt();
        if(first == second && first == third)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
