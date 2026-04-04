import java.util.Scanner;

class April4 {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : 2 * n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        Solution obj = new Solution();
        int result = obj.smallestEvenMultiple(n);

        System.out.println(result);  
    }
}