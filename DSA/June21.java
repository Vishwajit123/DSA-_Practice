import java.util.*;

public class June21 {
    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();

        int a = 1;
        while (a <= bound) {
            int b = 1;
            while (a + b <= bound) {
                set.add(a + b);

                if (y == 1) break;
                b *= y;
            }

            if (x == 1) break;
            a *= x;
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int bound = sc.nextInt();

        List<Integer> ans = powerfulIntegers(x, y, bound);

        System.out.println(ans);
    }
}