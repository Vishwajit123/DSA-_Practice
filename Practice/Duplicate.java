import java.util.*;
class Duplicate{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int[] res = new int[n];
        int j=0;
        for(int i=0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                res[j++] = arr[i];
            }
        }
        res[j++] = arr[n-1];
        for(int i=0; i < j; i++){
            System.out.println(res[i] +" ");
        }
    }
}