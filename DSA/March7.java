import java.util.*;

class March8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String text = sc.nextLine();

        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for(char c : text.toCharArray()){
            if(c == 'b') b++;
            else if(c == 'a') a++;
            else if(c == 'l') l++;
            else if(c == 'o') o++;
            else if(c == 'n') n++;
        }

        l /= 2;
        o /= 2;

        int result = Math.min(Math.min(b,a), Math.min(Math.min(l,o), n));

        System.out.println(result);
    }
}