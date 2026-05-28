import java.util.*;

class May28 {

    public int[][] kClosest(int[][] points, int k) {

        Arrays.sort(points, (a, b) -> {
            int d1 = a[0] * a[0] + a[1] * a[1];
            int d2 = b[0] * b[0] + b[1] * b[1];
            return d1 - d2;
        });

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            ans[i] = points[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of points: ");
        int n = sc.nextInt();

        int[][] points = new int[n][2];

        System.out.println("Enter x and y coordinates:");

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        May28 obj = new May28();

        int[][] result = obj.kClosest(points, k);

        System.out.println("K Closest Points:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }

        
    }
}