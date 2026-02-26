import java.util.Scanner;

public class Feb26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] bits = new int[n + 1];

        for(int i = 1; i <= n; i++){
            bits[i] = bits[i >> 1] + (i & 1);
        }

        System.out.println("Output:");

        for(int i = 0; i <= n; i++){
            System.out.print(bits[i] + " ");
        }
    }
}