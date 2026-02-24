package Task06;
    import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        int m = sc.nextInt();   // number of queries

        long[] arr = new long[n + 2];  // use long to avoid overflow

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long k = sc.nextLong();

            arr[a] += k;
            arr[b + 1] -= k;
        }

        long max = 0;
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);

        sc.close();
    }
}

