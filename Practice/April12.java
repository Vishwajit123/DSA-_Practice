import java.util.*;

class April12 {
    public int subtractProductAndSum(int n) {
        int sum = 0, pro = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            pro *= digit;
            n /= 10;
        }
        return pro - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        April12 obj = new April12();
        int result = obj.subtractProductAndSum(n);

        System.out.println("Result: " + result);

    }
}