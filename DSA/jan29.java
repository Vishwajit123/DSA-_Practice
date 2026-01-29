import java.util.Scanner;

class jan29 {

    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return sum % k;  
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        jan29 obj = new jan29();
        int result = obj.minOperations(nums, k);

        System.out.println("Minimum operations required: " + result);

        sc.close();
    }
}
