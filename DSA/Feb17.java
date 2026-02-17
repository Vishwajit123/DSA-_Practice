import java.util.*;

class Feb17 {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        
        for(int num : arr){
            if(num == 0){
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1;

        
        while(i >= 0){

            if(j < n){
                arr[j] = arr[i];
            }

            if(arr[i] == 0){
                j--;
                if(j < n){
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        duplicateZeros(arr);

        System.out.print("Output: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
