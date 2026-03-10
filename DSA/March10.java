
import java.util.*;

class March10 {

    public static int[] relativeArray(int[] arr1, int[] arr2) {

        int[] cnt = new int[1001];   
        for (int i : arr1) {
            cnt[i]++;
        }

        int ind = 0;
        for (int i : arr2) {
            while (cnt[i]-- > 0) {
                arr1[ind++] = i;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i]-- > 0) {
                arr1[ind++] = i;
            }
        }
            return arr1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of array1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements of array2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int result[] = relativeArray(arr1, arr2);

        System.out.println("Relative Sorted Array:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
