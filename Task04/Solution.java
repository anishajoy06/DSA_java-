package Task04;
import java.util.*;

public class Solution {

    public static int[] rotateLeft(int d, int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + d) % n];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rotated = rotateLeft(d, arr);

        for (int num : rotated) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

