import java.util.Scanner;

public class May1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long left = 1, right = num;
        boolean isPerfect = false;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                isPerfect = true;
                break;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(isPerfect);

    }
}