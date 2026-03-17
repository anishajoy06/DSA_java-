package Task25;
import java.util.*;

public class Solution {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            if (score > max) {
                max = score;
                maxCount++;
            } else if (score < min) {
                min = score;
                minCount++;
            }
        }

        return Arrays.asList(maxCount, minCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        List<Integer> result = breakingRecords(scores);

        System.out.println(result.get(0) + " " + result.get(1));
    }
}
