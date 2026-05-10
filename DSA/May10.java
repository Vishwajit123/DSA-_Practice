import java.util.Scanner;

class May10 {

    public static boolean isGood(int num) {

        boolean res = false;

        while (num > 0) {

            int digit = num % 10;

            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }

            if (digit == 2 || digit == 5 ||
                digit == 6 || digit == 9) {

                res = true;
            }

            num /= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (isGood(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}