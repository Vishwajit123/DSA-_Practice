import java.util.Scanner;

public class June8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution obj = new Solution();
        System.out.printf("%.5f%n", obj.soupServings(n));

    }
}

class Solution {

    private Double[][] dp;

    public double soupServings(int n) {

        if (n > 4800) {
            return 1.0;
        }

        int m = (n + 24) / 25; 
        dp = new Double[m + 1][m + 1];

        return solve(m, m);
    }

    private double solve(int a, int b) {

        if (a <= 0 && b <= 0) {
            return 0.5;
        }

        if (a <= 0) {
            return 1.0;
        }

        if (b <= 0) {
            return 0.0;
        }

        if (dp[a][b] != null) {
            return dp[a][b];
        }

        dp[a][b] = 0.25 * (
                solve(Math.max(0, a - 4), b) +
                solve(Math.max(0, a - 3), Math.max(0, b - 1)) +
                solve(Math.max(0, a - 2), Math.max(0, b - 2)) +
                solve(Math.max(0, a - 1), Math.max(0, b - 3))
        );

        return dp[a][b];
    }
}