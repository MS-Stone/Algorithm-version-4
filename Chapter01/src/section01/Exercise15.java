package section01;

/**
 * @author MS-Stone
 * @version jdk11 @2020-03-09
 * @Description
 */
public class Exercise15 {
    public static void main(String[] args) {
        int[] a = {1,2,1,2,1,5,3,4,3,4,4,4,4};
        int[] b = histogram(a, 6);
        for(var i : b) {
            System.out.println(i);
        }
        int sum = 0;
        for(var i : b) {
            sum += i;
        }
        System.out.println(sum == a.length);
    }

    public static int[] histogram(int[] a, int M) {
        int[] ans = new int[M];
        for(int i = 0; i < a.length; i++) {
                if(a[i]>=0 && a[i] < M) ans[a[i]]++;
        }
        return ans;
    }
}

