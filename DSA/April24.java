import java.util.*;

public class April24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[][] tasks = new int[n][2];

        for (int i = 0; i < n; i++) {
            tasks[i][0] = sc.nextInt(); 
            tasks[i][1] = sc.nextInt(); 
        }

        int minTime = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int finishTime = tasks[i][0] + tasks[i][1];
            minTime = Math.min(minTime, finishTime);
        }

        System.out.println(minTime);
    }
}