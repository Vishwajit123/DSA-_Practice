import java.util.*;
class March25{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the aray:");
        int n = sc.nextInt();
        System.out.println("Enter the array of the elements:");
        int[] num = new int[n];

        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int Second=Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++ ){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j]= num[j+1];
                    num[j+1] = temp;
                }
            }
           
        }
           
        for(int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }

       

    }
}