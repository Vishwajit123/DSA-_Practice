import java.util.*;
class March20{
    public static List<Integer> missingNumber(int[] res){
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : res){
             max = Math.max(max, num);
             min = Math.min(min, num);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : res){
            set.add(num);
        }
        for(int i = min+1; i < max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the array number:");
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = sc.nextInt();
        }
             List<Integer> result = missingNumber(res);
             System.out.println("Missing elements: " + result);
    }
}