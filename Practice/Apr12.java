import java.util.*;

class Apr12 {
    public int numberOfSteps(int num) {
        int cn = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            cn++;
        }
        return cn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Apr12 obj = new Apr12();
        int result = obj.numberOfSteps(num);

        System.out.println("Number of steps: " + result);

        sc.close();
    }
}