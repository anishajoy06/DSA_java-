package Task12;
import java.util.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int n = arr.length;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f\n", (double) positive / n);
        System.out.printf("%.6f\n", (double) negative / n);
        System.out.printf("%.6f\n", (double) zero / n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        plusMinus(arr);
        
        sc.close();
    }
} 
    
