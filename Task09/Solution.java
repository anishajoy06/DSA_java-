import java.util.*;

public class Solution {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));

        sc.close();
    }
}