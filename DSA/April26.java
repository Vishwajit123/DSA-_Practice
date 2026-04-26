import java.util.*;

class April26 {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int op = 0;

            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    op += Math.abs(i - j);
                }
            }

            ans[i] = op;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String boxes = sc.nextLine();

        April26 obj = new April26();
        int result[] = obj.minOperations(boxes);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}