import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input

        System.out.println(countNumbersWithUniqueDigits(n));
    }

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int count = 10;
        int uniqueDigits = 9;
        int available = 9;

        while (n > 1 && available > 0) {
            uniqueDigits = uniqueDigits * available;
            count += uniqueDigits;

            available--;
            n--;
        }

        return count;
    }
}