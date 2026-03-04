public class Solution {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print hashes
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        staircase(n);
    }
}