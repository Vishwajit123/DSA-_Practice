import java.util.*;

class May27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String[] s1 = num1.split("\\+");
        String[] s2 = num2.split("\\+");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1].replace("i", ""));

        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1].replace("i", ""));

        int real = (a * c) - (b * d);
        int imaginary = (a * d) + (b * c);

        System.out.println(real + "+" + imaginary + "i");
    }
}