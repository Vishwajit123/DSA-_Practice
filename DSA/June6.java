import java.util.*;

class June6 {

    private int[] original;
    private Random rand;

    public Solution(int[] nums) {
        original = nums.clone();
        rand = new Random();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        int[] shuffled = original.clone();

        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }

        return shuffled;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution June6 = new June6(nums);

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(solution.reset()));

        System.out.println("Shuffled Array:");
        System.out.println(Arrays.toString(solution.shuffle()));

        System.out.println("Reset Array:");
        System.out.println(Arrays.toString(solution.reset()));

        System.out.println("Shuffled Array Again:");
        System.out.println(Arrays.toString(solution.shuffle()));
    }
}   