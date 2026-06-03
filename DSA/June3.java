import java.util.Scanner;

public class June3 {

    public static int reachNumber(int target) {

        target = Math.abs(target);

        int sum = 0;
        int moves = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }

        return moves;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int ans = reachNumber(target);

        System.out.println("Minimum moves = " + ans);
    }
}