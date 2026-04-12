import java.util.Scanner;

class April12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   

        April12 obj = new April12();
        int result = obj.countDigits(num);

        System.out.println(result);

        
    }
    public int countDigits(int num) {
        int cn = 0;
        int temp = num;

        while (temp > 0) {
            int ld = temp % 10;

            if (ld != 0 && num % ld == 0) {
                cn++;
            }

            temp /= 10;
        }
        return cn;
    }
}



