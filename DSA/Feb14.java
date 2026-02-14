import java.util.*;

class Feb14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int total = 0;

       
        for(int num : arr){
            total += num;
        }

        
        if(total % 3 != 0){
            System.out.println("false");
            return;
        }

        int target = total / 3;
        int currentSum = 0;
        int count = 0;

       
        for(int num : arr){
            currentSum += num;

            if(currentSum == target){
                count++;
                currentSum = 0;
            }
        }

        if(count >= 3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
