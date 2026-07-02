import java.util.Scanner;
class July2 {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long)Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;

            if (sum == c) return true;
            else if (sum < c) a++;
            else b--;
        }

        return false;
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the C:");
    int c=sc.nextInt();
    July2 obj=new July2();
    boolean res = obj.judgeSquareSum(c);
    System.out.println(res);
}
}