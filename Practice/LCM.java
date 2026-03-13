import java.util.Scanner;
class LCM{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int num2 = sc.nextInt();

        int a = num1 ;
        int b = num2;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The HCF is " + a);

        int lcm = (num1 * num2) / a;
        System.out.println("The LCM is " + lcm);
    }
}