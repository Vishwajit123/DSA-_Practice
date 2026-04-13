import java.util.*;

class April13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int weekStart = 1;

        while (n > 0) {
            int dayMoney = weekStart;

            for (int day = 1; day <= 7 && n > 0; day++) {
                sum += dayMoney;
                dayMoney++;
                n--;
            }

            weekStart++;
        }

        System.out.println(sum);
    }
}