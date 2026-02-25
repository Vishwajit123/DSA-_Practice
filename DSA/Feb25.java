import java.util.*;

public class Feb25 {

    public static int reverseBits(int n) {
        int result = 0;

        for(int i = 0; i < 32; i++) {

            result = result << 1;       

            result = result | (n & 1);  

            n = n >>> 1;                
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = reverseBits(n);

        System.out.println("Reversed Bits Result: " + reversed);
    }
}