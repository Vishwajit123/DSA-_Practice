class operator{
    public static void main(String []args){
        int l = 3, m = 7, n = 0, s;
            l++;

            m = -(--m);
            s = -l++;
            n = m++ + m--;

            System.out.println(l);
            System.out.println(m);
            System.out.println(s);
            System.out.println(n);

            int a = 5;

            a = a++;
            System.out.println(a);



    }
}