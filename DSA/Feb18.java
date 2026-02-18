import java.util.*;

class Feb18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

      
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){

                int preInd = map.get(nums[i]);

                if(i - preInd <= k){
                    System.out.println("true");
                    return;
                }
            }

            map.put(nums[i], i);
        }

        System.out.println("false");
    }
}
