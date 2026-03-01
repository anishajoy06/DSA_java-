import java.util.*;

public class Solution {

    public static long aVeryBigSum(long[] ar) {
        long sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] ar = new long[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
        }

        System.out.println(aVeryBigSum(ar));

        sc.close();
    }
}