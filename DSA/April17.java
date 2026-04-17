import java.util.Scanner;

class April17 {
    public boolean checkPerfectNumber(int num) {
        int i = 1, sum = 0;

        while (i <= num / 2) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }

        return num == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        April17 obj = new April17();
        boolean result = obj.checkPerfectNumber(num);

        if (result) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

    }
}