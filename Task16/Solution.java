public class Solution {

    static void miniMaxSum(int[] arr) {
        long total = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9}; // sample input
        miniMaxSum(arr);
    }
}