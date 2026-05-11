import java.util.*;

class May11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter size of nums1:");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        
        System.out.println("Enter size of nums2:");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        
        System.out.println("Enter size of nums3:");
        int n3 = sc.nextInt();

        int[] nums3 = new int[n3];

        System.out.println("Enter elements of nums3:");
        for (int i = 0; i < n3; i++) {
            nums3[i] = sc.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

       
        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        for (int x : nums3) {
            set3.add(x);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        
        for (int i = 1; i <= 100; i++) {

            int count = 0;

            if (set1.contains(i)) count++;
            if (set2.contains(i)) count++;
            if (set3.contains(i)) count++;

            if (count >= 2) {
                ans.add(i);
            }
        }

        System.out.println("Answer: " + ans);
    }
}