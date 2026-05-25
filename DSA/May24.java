import java.util.*;

class May24 {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new TreeSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) continue;

                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(num);
                }
            }
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        May24 obj = new May24();
        int[] ans = obj.findEvenNumbers(digits);

        System.out.println("Valid 3-digit even numbers:");
        for (int num : ans) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}