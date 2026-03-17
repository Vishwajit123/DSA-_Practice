import java.util.*;

class March17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int[] res = smallerNumbersThanCurrent(nums);

        System.out.println("Result:");
        for(int num : res){
            System.out.print(num + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int cnt = 0;

            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    cnt++;
                }
            }

            res[i] = cnt;
        }

        return res;
    }
}