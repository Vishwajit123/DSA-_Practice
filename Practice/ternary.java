import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Largest number is: " + result);

        sc.close();
    }
}
