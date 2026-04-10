import java.util.*;

class April10 {

    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int i = 0;

        while (k > 0) {
            if (i < arr.length && arr[i] == num) {
                i++;
            } else {
                k--;
                if (k == 0) {
                    return num;
                }
            }
            num++;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        April10 obj = new April10();

        int result = obj.findKthPositive(arr, k);

        System.out.println(result);
    }
}