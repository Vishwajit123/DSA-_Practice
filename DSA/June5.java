import java.util.*;

public class Main {

    public static String optimalDivision(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return String.valueOf(nums[0]);
        }

        if (n == 2) {
            return nums[0] + "/" + nums[1];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(");

        for (int i = 1; i < n; i++) {
            sb.append(nums[i]);

            if (i != n - 1) {
                sb.append("/");
            }
        }

        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(optimalDivision(nums));
    }
}