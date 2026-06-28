import java.util.*;

public class June26 {

    private static int[] getPair(int n) {
        for (int d = (int) Math.sqrt(n); d >= 1; d--) {
            if (n % d == 0) {
                return new int[]{d, n / d};
            }
        }
        return new int[0];
    }

    public static int[] closestDivisors(int num) {
        int[] pair1 = getPair(num + 1);
        int[] pair2 = getPair(num + 2);

        if (Math.abs(pair1[1] - pair1[0]) <= Math.abs(pair2[1] - pair2[0])) {
            return pair1;
        }
        return pair2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] ans = closestDivisors(num);

        System.out.println(ans[0] + " " + ans[1]);

    }
} // This is the 26 June