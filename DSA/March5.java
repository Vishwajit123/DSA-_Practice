import java.util.Scanner;

class March5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while(n >= 10){

            int sum = 0;

            for(int i = n; i > 0; i /= 10){
                sum += i % 10;
            }

            n = sum;
        }

        System.out.println("Result: " + n);
    }
}