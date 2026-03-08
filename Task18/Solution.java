package Task18;
import java.util.*;

public class Solution {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        int count = 0;

        for (int candle : candles) {
            if (candle == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(4, 4, 1, 3);
        System.out.println(birthdayCakeCandles(candles));
    }
}