import java.util.*;

class April23 {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                sum1 += nums[i];
            }
            if (nums[i] > 9) {
                sum2 += nums[i];
            }
        }

        return sum1 == sum2 ? false : true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        April23 obj = new April23();
        System.out.println(obj.canAliceWin(nums));
    }
}