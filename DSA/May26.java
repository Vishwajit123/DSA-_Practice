import java.util.Scanner;

class May26 {
    public boolean validDigit(int n, int x) {
        int temp = n;
        boolean found = false;

        if (n == 0) {
            return false;
        }

        while (temp > 0) {
            int ld = temp % 10;

            if (ld == x) {
                found = true;
            }

            temp /= 10;
        }

        temp = n;
        while (temp >= 10) {
            temp /= 10;
        }

        int firstDigit = temp;

        return found && firstDigit != x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        May26 obj = new May26();

        System.out.println(obj.validDigit(n, x));

        sc.close();
    }
}