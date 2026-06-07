import java.util.*;

public class June7 {
    private int[][] dp;
    private int[] suffix;

    public int stoneGameII(int[] piles) {
        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return dfs(0, 1, n);
    }

    private int dfs(int i, int m, int n) {
        if (i >= n) {
            return 0;
        }

        if (2 * m >= n - i) {
            return suffix[i];
        }

        if (dp[i][m] != 0) {
            return dp[i][m];
        }

        int maxStones = 0;

        for (int x = 1; x <= 2 * m; x++) {
            maxStones = Math.max(
                maxStones,
                suffix[i] - dfs(i + x, Math.max(m, x), n)
            );
        }

        dp[i][m] = maxStones;
        return maxStones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];

        System.out.print("Enter pile stones: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        June7 obj = new June7();
        System.out.println("Maximum stones Alice can get: " + obj.stoneGameII(piles));

    }
}