import java.util.*;

public class June27 {
    private static final int MOD = 1337;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();   

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.superPow(a, b));

        sc.close();
    }
}

class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a %= MOD;
        int ans = 1;

        for (int digit : b) {
            ans = (powMod(ans, 10) * powMod(a, digit)) % MOD;
        }

        return ans;
    }

    private int powMod(int a, int exp) {
        a %= MOD;
        int res = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            exp >>= 1;
        }

        return res;
    }
}