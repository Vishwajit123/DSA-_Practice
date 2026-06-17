import java.util.Scanner;

public class June17 {

    public static int minSteps(int n) {
        int steps = 0;

        for (int factor = 2; factor <= n; factor++) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Minimum Operations: " + minSteps(n));

    }
}