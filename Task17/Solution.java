package Task17;

import java.util.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) {

        long total = 0;
        long min = arr.get(0);
        long max = arr.get(0);

        for (int num : arr) {
            total += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        Result.miniMaxSum(arr);

        sc.close();
    }
}