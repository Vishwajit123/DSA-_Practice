import java.util.*;

class March25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        String[] operations = new String[n];

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        int x = 0;

        for (String op : operations) {
            if (op.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println("Final value of X is: " + x);
    }
}