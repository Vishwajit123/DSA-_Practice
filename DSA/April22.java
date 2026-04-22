import java.util.*;

class April22 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        April22 obj = new April22();
        System.out.println(obj.maximumWealth(accounts));
    }
}