import java.util.Scanner;

public class June25 {

    public static int numTrees(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        if (n >= 1) {
            dp[1] = 1;
        }

        for (int nodes = 2; nodes <= n; nodes++) {
            for (int root = 1; root <= nodes; root++) {
                dp[nodes] += dp[root - 1] * dp[nodes - root];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(numTrees(n));
    }
}