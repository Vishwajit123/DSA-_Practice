import java.util.*;

class March19 {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j > index[i]; j--) {
                result[j] = result[j - 1];
            }

            result[index[i]] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        System.out.println("Enter nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter index array:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        March19 obj = new March19();
        int[] result = obj.createTargetArray(nums, index);

        System.out.println("Target array:");
        System.out.println(Arrays.toString(result));

       
    }
}