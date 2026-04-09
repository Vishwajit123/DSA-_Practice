import java.util.*;

public class April9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }

            else if(i % 3 == 0) {
                list.add("Fizz");
            }

            else if(i % 5 == 0) {
                list.add("Buzz");
            }

            else {
                list.add(String.valueOf(i));
            }
        }

        System.out.println(list);

    }
}