import java.util.*;

public class April28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] hours = new int[n];

        for (int i = 0; i < n; i++) {
            hours[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(result);
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                cnt++;
            }
        }
        return cnt;
    }
}