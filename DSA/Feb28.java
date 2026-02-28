import java.util.Scanner;

public class Feb28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        char result = 0;

        
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        System.out.println("Extra letter is: " + result);
    }
}