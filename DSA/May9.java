import java.util.*;

class May9 {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean good = true;

            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                good = false;
            }

            if (i + k < nums.length && nums[i] <= nums[i + k]) {
                good = false;
            }

            if (good) {
                sum += nums[i];
            }
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

        May9 obj = new May9();

        System.out.println(obj.sumOfGoodNumbers(nums, k));

 
    }
}