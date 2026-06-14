import java.util.*;

public class June14 {

    static Map<String, Map<String, Double>> graph = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of equations: ");
        int n = sc.nextInt();

        String[][] equations = new String[n][2];
        double[] values = new double[n];

        System.out.println("Enter equations and values:");
        System.out.println("Format: a b 2.0");

        for (int i = 0; i < n; i++) {
            equations[i][0] = sc.next();
            equations[i][1] = sc.next();
            values[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            String a = equations[i][0];
            String b = equations[i][1];
            double val = values[i];

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, val);
            graph.get(b).put(a, 1.0 / val);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        double[] result = new double[q];

        System.out.println("Enter queries:");
        System.out.println("Format: a c");

        for (int i = 0; i < q; i++) {

            String src = sc.next();
            String dest = sc.next();

            if (!graph.containsKey(src) || !graph.containsKey(dest)) {
                result[i] = -1.0;
            } else if (src.equals(dest)) {
                result[i] = 1.0;
            } else {
                Set<String> visited = new HashSet<>();
                result[i] = dfs(src, dest, 1.0, visited);
            }
        }

        System.out.println("Results:");

        for (double ans : result) {
            System.out.printf("%.5f ", ans);
        }
    }

    static double dfs(String curr, String target,
                      double product, Set<String> visited) {

        if (curr.equals(target)) {
            return product;
        }

        visited.add(curr);

        for (Map.Entry<String, Double> entry : graph.get(curr).entrySet()) {

            String next = entry.getKey();

            if (!visited.contains(next)) {

                double ans = dfs(next, target,
                                 product * entry.getValue(),
                                 visited);

                if (ans != -1.0) {
                    return ans;
                }
            }
        }

        return -1.0;
    }
}