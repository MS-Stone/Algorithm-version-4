package section01;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise19 {
    public static void main(String[] args) {
        long[] f = Fibonacci.F(2);
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + f[N]);
        }
    }
}

class Fibonacci {
    public static long[] F(int N) {
        long[] f = new long[N];
        f[0] = 0;
        if(N < 2) return f;
        f[1] = 1;
        if(N < 3) return f;
        for(int i = 2; i < N; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f;
    }
}
