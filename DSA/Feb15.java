import java.util.*;

class Feb15 {

    public static int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){

            if(set.contains(num)){
                return num;
            }

            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size (2N):");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = repeatedNTimes(nums);

        System.out.println("Repeated Element: " + result);
    }
}
