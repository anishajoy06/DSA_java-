package Task03;
 import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // Initialize n empty sequences
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        for (int i = 0; i < q; i++) {

            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } 
            else if (type == 2) {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                System.out.println(lastAnswer);
            }
        }

        sc.close();
    }
}
