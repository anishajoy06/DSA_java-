package Task24;
import java.util.*;

public class Solution {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;

        int start = Collections.max(a);
        int end = Collections.min(b);

        for (int i = start; i <= end; i++) {

            boolean valid = true;

            for (int num : a) {
                if (i % num != 0) {
                    valid = false;
                    break;
                }
            }

            for (int num : b) {
                if (num % i != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        System.out.println(getTotalX(a, b));
    }
}
