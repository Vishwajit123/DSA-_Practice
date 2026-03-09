import java.util.Scanner;

class March9 {

    public boolean isThree(int n) {
        int cnt = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                cnt++;
            }
        }

        return cnt == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        March9 obj = new March9();
        boolean result = obj.isThree(n);

        System.out.println(result);
    }
}