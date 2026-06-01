import java.util.Scanner;

public class June1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans ^= (start + 2 * i);
        }

        System.out.println("Result = " + ans);
    }
}