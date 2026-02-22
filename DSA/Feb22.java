import java.util.*;

class Feb22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean[] seen = new boolean[n + 1];
        int duplicate = -1;
        int missing = -1;

        
        for(int num : nums) {
            if(seen[num]) {
                duplicate = num;
            }
            seen[num] = true;
        }

        
        for(int i = 1; i <= n; i++) {
            if(!seen[i]) {
                missing = i;
            }
        }

        
        System.out.println("Duplicate Number: " + duplicate);
        System.out.println("Missing Number: " + missing);
    }
}