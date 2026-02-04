import java.util.*;

class Feb4 {

    public static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int max = 0;
        for (int j = 1; j < nums.length; j++) {
            max = Math.max(max, nums[j] - nums[j - 1]);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maximumGap(nums);
        System.out.println("Maximum Gap = " + result);

        sc.close();
    }
}
