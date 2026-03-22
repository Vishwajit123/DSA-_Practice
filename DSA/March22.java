import java.util.*;

class March22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            if(n % (i + 1) == 0){
                sum += nums[i] * nums[i];
            }
        }

        System.out.println("Sum of squares = " + sum);
    }
}