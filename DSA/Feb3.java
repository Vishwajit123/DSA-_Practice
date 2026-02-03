// -----------------------------------RemoveDuplicatesII-----------------------------------------------


import java.util.*;

public class Feb3 {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int i = 2;  

        for (int j = 2; j < n; j++) {  
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

      
        System.out.println("New length (k): " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
