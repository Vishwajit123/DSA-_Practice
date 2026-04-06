import java.util.Scanner;

class April6 {
    public int mirrorDistance(int n) {
        int rev = 0;
        int org = n;

        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return Math.abs(org - rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        April6 obj = new April6();
        int result = obj.mirrorDistance(n);

        System.out.println("Mirror Distance: " + result);

        sc.close();
    }
}