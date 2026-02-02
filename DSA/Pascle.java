import java.util.*;

class Pascle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();

        List<List<Integer>> triangle = generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            long val = 1;

            for (int j = 0; j <= i; j++) {
                row.add((int) val);
                val = val * (i - j) / (j + 1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}
