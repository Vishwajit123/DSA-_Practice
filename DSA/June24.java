import java.util.*;

public class June24 {

    public static int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j])) {
                minDist = Math.min(minDist, j - map.get(nums[j]));
            }

            int rev = reverse(nums[j]);
            map.put(rev, j);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    private static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = minMirrorPairDistance(nums);
        System.out.println(result);
    }
}