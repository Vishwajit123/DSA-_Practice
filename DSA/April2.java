import java.util.Scanner;

class April2 {

    public  int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    public int helper(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            return currentXor;
        }

        int i = helper(nums, index + 1, currentXor ^ nums[index]);
        int e = helper(nums, index + 1, currentXor);

        return i + e;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        April2 obj = new April2();
        int result = obj.subsetXORSum(nums);

        System.out.println("Subset XOR Sum: " + result);
    }
}