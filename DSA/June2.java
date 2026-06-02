import java.util.*;

class June2 {
    public int[] beautifulArray(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        while (res.size() < n) {
            List<Integer> temp = new ArrayList<>();

            for (int x : res) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }

            for (int x : res) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }

            res = temp;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        June2 obj = new June2();
        int[] result = obj.beautifulArray(n);

        System.out.println("Beautiful Array:");
        for (int x : result) {
            System.out.print(x + " ");
        }

    }
}