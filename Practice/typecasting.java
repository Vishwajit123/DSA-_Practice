public class typecasting {

      public static void main(String[] args) {


// -------------- Widening ------------------

        // biggerType variable = smallerTypeVariable;

        byte b = 25;
        short b = 100;
        char b ='a';
        int b = 2000;
        long b = 15838774387l;
        float b = 40.87f;
        double b = 509.876786876876;

        short s = b;
        char ch = b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("char: " + ch);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // -------------------- Narrowing ---------------------------------------------------------------------------

        // smallerType variable = (smallerType) biggerTypeVariable;

        double d = 509.876786876876;   
        float d = 123.5f;
        int d = 32767;
        char d = 'x';
        short d = 122;
        byte d = 50;

        double e = (double) d;
        float f = (float) d;   // double to float precision loss
        long l = (long) d;
        int i = (int) d;  // float to int decimal removed
        short s = (short) d; // int to short overflow it the more than 32768
        byte b = (byte) d;  // int to byte  sign is change 
        char ch = (char) d;

        System.out.println("double : " + e);
        System.out.println("float  : " + f);
        System.out.println("long   : " + l);
        System.out.println("int    : " + i);
        System.out.println("short  : " + s);
        System.out.println("byte   : " + b);
        System.out.println("char   : " + ch);


    }
}