package Task05;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stringList.add(sc.nextLine());
        }

        int q = sc.nextInt();
        sc.nextLine();  // consume newline

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            queries.add(sc.nextLine());
        }

        // Store frequencies
        HashMap<String, Integer> freq = new HashMap<>();

        for (String s : stringList) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        // Answer queries
        for (String query : queries) {
            System.out.println(freq.getOrDefault(query, 0));
        }

        sc.close();
    }
}

