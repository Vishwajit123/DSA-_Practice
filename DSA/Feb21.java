import java.util.*;

public class Feb21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        Long first = null;
        Long second = null;
        Long third = null;
        
        for(int num : nums){
            
            long val = num;
            
            if((first != null && val == first) ||
               (second != null && val == second) ||
               (third != null && val == third)){
                continue;
            }
            
            if(first == null || val > first){
                third = second;
                second = first;
                first = val;
            }
            else if(second == null || val > second){
                third = second;
                second = val;
            }
            else if(third == null || val > third){
                third = val;
            }
        }
        
        int result = (third == null) ? first.intValue() : third.intValue();
        
        System.out.println("Third Maximum Number: " + result);
    }
}