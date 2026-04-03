import java.util.*;

class April3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        April3 obj = new April3();
        List<Integer> result = obj.findDuplicates(nums);

        System.out.println(result);
    }

    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(set.contains(num)){
                list.add(num);
            } else {
                set.add(num);
            }
        }
        return list;
    }
}