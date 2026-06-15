import java.util.Scanner;

public class June15 {

    public static int sumFourDivisors(int[] nums) {
        int tsum = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = 1, cn = 0, sum = 0;

            while (nums[i] >= j) {
                if (nums[i] % j == 0) {
                    cn++;
                    sum += j;
                }
                j++;
            }

            if (cn == 4) {
                tsum += sum;
            }
        }

        return tsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sumFourDivisors(nums);

        System.out.println("Output: " + result);

    }
}