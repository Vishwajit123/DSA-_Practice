// -------------------------------------- Longest Continuous Increasing Subsequence  -----------------------------------------

import java.util.*;

class Feb2 {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int count = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the element of the array: ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
           
        }

        System.out.println(findLengthOfLCIS(nums));
        sc.close();
    }
}
