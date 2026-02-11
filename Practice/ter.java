import java.util.*;
public class ter{
    public  static void main(String[] args){
        
        System.out.println("Enter the character: ");
        char ch = new Scanner(System.in).nextLine().toUpperCase().charAt(0);

        String op = 
        (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) ?
        (ch + " is the vowel"):
        (ch + " is the consonent");

        System.out.println(op);
       

    }
}