import java.util.Scanner;

public class June11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.findNthDigit(n));
    }
}

class Solution {
    public int findNthDigit(int n) {
        long digits = 1;
        long count = 9;
        long start = 1;

        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        long number = start + (n - 1) / digits;
        String str = String.valueOf(number);

        return str.charAt((int)((n - 1) % digits)) - '0';
    }
}