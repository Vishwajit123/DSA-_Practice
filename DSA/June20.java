import java.util.*;

public class June20 {

    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            for (int j = 2; j <= n; j++) {
                while (n % j == 0) {
                    set.add(j);
                    n /= j;
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        June20 obj = new June20();
        System.out.println(obj.distinctPrimeFactors(nums));
    }
}