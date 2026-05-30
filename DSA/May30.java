import java.util.Scanner;

class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int original = n;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        int min = Math.min(original, rev);
        int max = Math.max(original, rev);

        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.sumOfPrimesInRange(n);

        System.out.println(result);
    }
}