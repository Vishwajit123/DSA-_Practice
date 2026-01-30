import java.util.*;

class jan31 {

    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        int min = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }

        if (k % 2 == 1) {
            sum -= 2 * min;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = largestSumAfterKNegations(nums, k);
        System.out.println(result);
    }
}
