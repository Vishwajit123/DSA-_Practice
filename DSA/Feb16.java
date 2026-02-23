import java.util.*;

public class ArrayPartition {

    public static int maxSumOfMinPairs(int[] nums) {

        
        Arrays.sort(nums);

        int sum = 0;

        
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of elements (must be even): ");
        int n = sc.nextInt(); 

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSumOfMinPairs(nums);

        System.out.println("Maximum Sum = " + result);
    }
}
