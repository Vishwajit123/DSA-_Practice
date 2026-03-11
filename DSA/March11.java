import java.util.*;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];

        for(int num : nums1){
            for(int i = 0; i < nums2.length; i++){
                if(!used[i] && num == nums2[i]){
                    list.add(num);
                    used[i] = true;
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of nums1:");
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of nums2:");
        for(int i = 0; i < m; i++){
            nums2[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.intersect(nums1, nums2);

        System.out.println("Intersection:");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}