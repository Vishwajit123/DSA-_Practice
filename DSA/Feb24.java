
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}
public class FEB24{
    public static void main(String ... vishwa){
        Solution sol = new Solution();
        System.out.print("Enter the val 1: ");
        int div = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the val 2: ");
        int dis = new java.util.Scanner(System.in).nextInt();
        System.out.println(sol.divide(div, dis));

    }
}