import java.util.*;

class March16 {

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            res[j++] = nums[i];
            res[j++] = nums[i + n];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = shuffle(nums, n);

        System.out.println("Shuffled array:");

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}