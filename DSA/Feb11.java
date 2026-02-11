import java.util.*;

class Feb11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target: ");
        int t = sc.nextInt();

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = minSubArrayLen(t, nums);
        System.out.println("Minimum length of the subarray: " + result);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum >= target) {
                minlen = Math.min(minlen, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
