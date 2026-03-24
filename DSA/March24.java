import java.util.*;

class March24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of customers (rows):");
        int m = sc.nextInt();

        System.out.println("Enter number of banks (columns):");
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];

        System.out.println("Enter the account values:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                accounts[i][j] = sc.nextInt();
            }
        }

        int maxwealth = 0;

        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += accounts[i][j];
            }
            maxwealth = Math.max(maxwealth, sum);
        }

        System.out.println("Maximum Wealth: " + maxwealth);
    }
}