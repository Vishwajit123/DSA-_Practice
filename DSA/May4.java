import java.util.*;

public class May4 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            
            if (start == nums[i]) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[i]);
            }
            
            i++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        List<String> ans = summaryRanges(nums);
        
        for (String s : ans) {
            System.out.print(s + " ");
        }
    }
}