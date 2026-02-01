import java.util.*;
class pivotIndex{
    public int pivot(int []num){

        int totalSum = 0;
        for(int nums : num){
            totalSum += nums;
        }
        int leftSum = 0;

        for(int i = 0 ; i < num.length; i++){
            int rightSum = totalSum - leftSum - num[i];

            if(rightSum == leftSum){
                return i;
            }
            leftSum += num[i];
        }
        return -1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.print("Enter the element in the array: ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        pivotIndex obj = new pivotIndex();
        int result = obj.pivot(arr);

        System.out.println("Pivot index is: " + result);
    }
}