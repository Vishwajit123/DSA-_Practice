import java.util.Scanner;
public class SecondLar{
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int Slargest=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }else if(arr[i]>Slargest && largest != arr[i]){
                    Slargest=arr[i];
            }
        }
        System.out.println(Slargest);
    }
}