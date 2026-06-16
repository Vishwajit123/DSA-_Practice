import java.util.Scanner;

class Solution {
    public int kthFactor(int n, int k) {
        int i = 1, cn = 0;

        while (i <= n) {
            if (n % i == 0) {
                cn++;
                if (cn == k)
                    return i;
            }
            i++;
        }
        return -1;
    }
}

public class June16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.kthFactor(n, k));
    }
}