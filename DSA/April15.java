import java.util.*;

class April16 {
    public static int smallestRangeI(int[] nums, int k) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return Math.max(0, max - min - 2 * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = smallestRangeI(nums, k);
        System.out.println(result);

    }
}