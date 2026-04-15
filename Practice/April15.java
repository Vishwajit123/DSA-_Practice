import java.util.Scanner;

class April15 {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            int sum = 0, temp = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum % 2 == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();  

        April15 obj = new April15();
        int result = obj.countEven(num);

        System.out.println(result);

    }
}