import java.util.*;

class March13{

    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0;
        int odd = 1;

        for(int num : nums){
            if(num % 2 == 0){
                ans[even] = num;
                even += 2;
            }
            else{
                ans[odd] = num;
                odd += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        March13 obj = new March13();
        int result[] = obj.sortArrayByParityII(arr);

        System.out.println("Sorted Array:");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}