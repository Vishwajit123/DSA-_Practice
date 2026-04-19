class  April1{
    public static void main(String[] args){
        System.out.println(techNumber(225));
    }
    public static boolean techNumber(int num){
        int dg = count(num);
        if(dg % 2 != 0) return false;

        int first = num / power(dg/2);
        int last = num % power(dg/2);

        int sum = first + last;

        if(num != sum * sum){
            return false;
        }
        return true;
    }
    public static int count(int num){
        int cnt=0;
        for(int i=num; i != 0; i/=10){
            cnt++;
        }
        return cnt;
    }
    public static int power(int num){
        int pow=1;
        for(int i=0; i <num; i++){
            pow*=10;
        }
        return pow;
    }
}




    // int n=1727;
    //     int sum = 0;
    //     for(int i = n; i != 0; i/=10){
    //         sum += i %10;
    //     }
    //     if(n % sum == 0){
    //         System.out.println("It is the Harshad Number");
    //     }
    //     else{
    //         System.out.println("It is not Harshad number");
    //     }