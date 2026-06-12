import java.util.Scanner;

public class June12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String str = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            if (i % 2 == 0)
                sum += digit;
            else
                sum -= digit;
        }

        System.out.println("Alternating Digit Sum = " + sum);

        
    }
}