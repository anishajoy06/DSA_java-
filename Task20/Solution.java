import java.util.*;

public class Solution {

    static long highestPowerOf2(long n) {
        long p = 1;
        while (p * 2 < n) {
            p *= 2;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if ((n & (n - 1)) == 0) {
                System.out.println(0);
            } else {
                long p = highestPowerOf2(n);
                System.out.println(n - p);
            }
        }

        sc.close();
    }
}