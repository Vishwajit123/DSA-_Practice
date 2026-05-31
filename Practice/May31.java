import java.util.Scanner;

public class May31 {
    public static void main(String[] args) {
        int n, num, dg, rev = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        num = n;
        for (int i = n; i > 0; i /= 10) {
            dg = i % 10;
            rev = rev * 10 + dg;
        }
        for (int i = rev; i > 0; i /= 10) {
            dg = i % 10;

            switch (dg) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Number");
            }
        }

    }
}