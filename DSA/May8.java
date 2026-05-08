import java.util.Scanner;

class May8 {

    public static int arraySign(int[] nums) {
        int negativecount = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                negativecount++;
            }
        }

        if (negativecount % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       
        int result = arraySign(nums);
        System.out.println(result);

       
    }
}