import java.util.Scanner;

public class June13 {

    public static int nthSuperUglyNumber(int n, int[] primes) {

        int k = primes.length;

        int[] dp = new int[n];
        dp[0] = 1;

        int[] index = new int[k];

        for (int i = 1; i < n; i++) {

            long next = Long.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                next = Math.min(next, (long) primes[j] * dp[index[j]]);
            }

            dp[i] = (int) next;

            for (int j = 0; j < k; j++) {
                if ((long) primes[j] * dp[index[j]] == next) {
                    index[j]++;
                }
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter number of primes: ");
        int m = sc.nextInt();

        int[] primes = new int[m];

        System.out.println("Enter prime numbers:");
        for (int i = 0; i < m; i++) {
            primes[i] = sc.nextInt();
        }

        int result = nthSuperUglyNumber(n, primes);

        System.out.println("Nth Super Ugly Number = " + result);

    }
}