import java.util.*;

class April17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int current = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(max, current);
        }

        System.out.println("Highest Altitude: " + max);
    }
}