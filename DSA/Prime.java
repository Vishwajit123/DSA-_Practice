import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();   

        int count = 0;

        System.out.print("Prime numbers: ");

        for (int j = 2; j < n; j++) {
            if (isPrime(j)) {
                System.out.print(j + " ");  
                count++;
            }
        }

        System.out.println("Total primes: " + count); 
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
