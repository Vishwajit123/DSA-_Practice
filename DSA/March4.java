import java.util.Scanner;

public class March3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println(false);
            return;
        }

        while(n % 3 == 0){
            n = n / 3;
        }

        if(n == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}