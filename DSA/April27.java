import java.util.*;

class  April27{
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int ans = 9;

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0) {
                if (freq[i] < minFreq) {
                    minFreq = freq[i];
                    ans = i;
                } else if (freq[i] == minFreq) {
                    ans = Math.min(ans, i);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        April27 obj = new April27();
        System.out.println(obj.getLeastFrequentDigit(n));
    }
}