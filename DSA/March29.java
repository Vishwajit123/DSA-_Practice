import java.util.*;
class March29{
    public static int findGCD(int[] nums) {
        int MIN=Integer.MAX_VALUE;
        int MAX=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(MAX < nums[i]) MAX=nums[i];
            if(MIN > nums[i]) MIN=nums[i];
        }
        while(MAX!=0){
            int temp = MAX;
            MAX =MIN % MAX;
            MIN = temp;
        }
        return MIN;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the element is the array:");
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        int res = findGCD(nums);
        System.out.println(res);
    }
}