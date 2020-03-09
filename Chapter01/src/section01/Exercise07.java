package section01;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise07 {
    public static void main(String[] args) {
        System.out.println("a. ");
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        System.out.println("b.");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
        StdOut.println("c.");
        int sum1 = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                sum1++;
            }
        }
        System.out.println(sum1);
    }
}
