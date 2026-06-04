import java.util.*;

public class June4 {

    public static int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);

        int op = 0; 
        for (int i = n - 1; i >= 1; i--) {
            if (op == 0) {
                st.push(st.pop() * i);
            } else if (op == 1) {
                st.push(st.pop() / i);
            } else if (op == 2) {
                st.push(i);
            } else {
                st.push(-i);
            }

            op = (op + 1) % 4;
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Clumsy Factorial = " + clumsy(n));

    }
}