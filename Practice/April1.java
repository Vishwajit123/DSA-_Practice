class  April1{
    public static void main(String[] main){
        int n=1727;
        int sum = 0;
        for(int i = n; i != 0; i/=10){
            sum += i %10;
        }
        if(n % sum == 0){
            System.out.println("It is the Harshad Number");
        }
        else{
            System.out.println("It is not Harshad number");
        }
    }
}