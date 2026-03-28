import java.util.*;

class March28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(alternatingSum(nums));
    }

    public static int alternatingSum(int[] nums) {
        int sub = 0, add = 0, total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                add += nums[i];
            } else {
                sub -= nums[i];
            }
            total = add + sub;
        }
        return total;
    }
}