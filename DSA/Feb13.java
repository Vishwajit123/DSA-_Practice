import java.util.*;
class Feb13{
     public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }

            set.add(num);
        }
         return false;
    }

    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elment in the array: ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Feb13 obj = new Feb13();

        boolean result = obj.containsDuplicate(arr);

       if(result){
        System.out.println("Duplicate exists");
       }
       else{
        System.out.println("All elements are distnict");
       }
    }
    
}