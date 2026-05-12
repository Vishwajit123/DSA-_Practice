import java.util.Scanner;

class May12 {

    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }

        return n % 2 == 0 ? n / 2 : n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        int result = obj.numberOfCuts(n);

        System.out.println("Number of Cuts: " + result);

        sc.close();
    }
}