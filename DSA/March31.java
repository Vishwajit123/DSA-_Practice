import java.util.*;

class March31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = sumZero(n);

        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0;

        for(int i = 1; i <= n / 2; i++) {
            arr[index++] = i;
            arr[index++] = -i;
        }

        if(n % 2 != 0) {
            arr[index] = 0;
        }

        return arr;
    }
}