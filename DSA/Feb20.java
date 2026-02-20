import java.util.*;

class SortByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while(left < right){

            if(nums[left] % 2 > nums[right] % 2){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if(nums[left] % 2 == 0) left++;
            if(nums[right] % 2 == 1) right--;
        }

        System.out.println("Sorted by Parity:");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}