import java.util.*;
class March15{
    public static int Gas(int[] gas, int[] cost){
        int total = 0;
        int tank = 0;
        int start = 0;
        for(int i=0; i < gas.length; i++){
            int diff = gas[i] - cost[i];
            total+= diff;
            tank+= diff;

            if(tank < 0){
                start = i + 1;
                tank = 0;
            }
        }
        if(total >= 0)
            return start;
        else
            return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of gas array:");
        int n = sc.nextInt();

        int[] gas = new int[n];

        System.out.println("Enter the element in Gas:");
        for(int i = 0; i < n; i++){
            gas[i] = sc.nextInt();
        }

         System.out.println("Enter the size of the array:");
        int m = sc.nextInt();

        int[] cost = new int[m];

        System.out.println("Enter the element in Cost:");
        for(int i = 0; i < m; i++){
            cost[i] = sc.nextInt();
        }

        int res = Gas(gas,cost);

        System.out.println( "Stsrting the gas index station: "+ res);
    }
}