import java.util.*;

class March23 {
    public int[] minDistinctFreqPair(int[] nums) {
        int n = nums.length;
        int[] fre = new int[100001];
        Arrays.sort(nums);

        for (int i : nums)
            fre[i]++;

        int min = nums[0];
        int minfre = fre[min];

        for (int i : nums) {
            if (i != min && minfre != fre[i]) {
                return new int[]{min, i};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        March23 obj = new March23();
        int[] ans = obj.minDistinctFreqPair(nums);

        System.out.println(ans[0] + " " + ans[1]);
    }
}