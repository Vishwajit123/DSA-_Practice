import java.util.Scanner;

class Solution {
    public int brokenCalc(int startValue, int target) {
        int operations = 0;

        while (target > startValue) {
            if (target % 2 == 0) {
                target /= 2;
            } else {
                target += 1;
            }
            operations++;
        }

        return operations + (startValue - target);
    }
}

public class June9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startValue = sc.nextInt();
        int target = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.brokenCalc(startValue, target);

        System.out.println(result);

    }
}