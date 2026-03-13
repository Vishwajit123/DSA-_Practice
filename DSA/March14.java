import java.util.*;

class  March14 {

    public static int findNumbers(int[] nums) {
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digit = 0;

            while(num > 0) {
                num = num / 10;
                digit++;
            }

            if(digit % 2 == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println("Numbers with even digits: " + result);
    }
}
