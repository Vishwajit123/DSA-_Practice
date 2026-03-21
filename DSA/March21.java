import java.util.*;

class March21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the n1:");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the n1 elements:");
        for(int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the n2:");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the n2 elements:");
        for(int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(nums1, nums2);

        for(int num : result) {
            System.out.print(+ num + " ");
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            int ans = -1;

            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    for(int k = j + 1; k < nums2.length; k++) {
                        if(nums2[k] > nums1[i]) {
                            ans = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }

            res[i] = ans;
        }

        return res;
    }
}