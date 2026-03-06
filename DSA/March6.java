import java.util.Scanner;

class March6 {

    public static boolean isUgly(int n){

        if(n <= 0) return false;

        while(n % 2 == 0){
            n /= 2;
        }

        while(n % 3 == 0){
            n /= 3;
        }

        while(n % 5 == 0){
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isUgly(n);

        if(result){
            System.out.println("It is an Ugly Number");
        }else{
            System.out.println("It is NOT an Ugly Number");
        }
    }
}