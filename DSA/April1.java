import java.util.*;

class April1 {
    public static int countKDifference(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] - nums[j] == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); 
        

        int[] nums = new int[n];

        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
         System.out.println("Enter the k in the array:");
        int k = sc.nextInt();

        System.out.println(countKDifference(nums, k));
    }
}