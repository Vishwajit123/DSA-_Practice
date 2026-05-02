import java.util.*;

public class May2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            distance[i] = sc.nextInt();
        }

        int start = sc.nextInt();
        int destination = sc.nextInt();

        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int clockwise = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += distance[i];
            if (i >= start && i < destination) {
                clockwise += distance[i];
            }
        }

        System.out.println(Math.min(clockwise, total - clockwise));
    }
}