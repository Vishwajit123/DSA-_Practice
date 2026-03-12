import java.util.*;

class March12 {

    public static int distributeCandies(int[] candyType) {

        HashSet<Integer> set = new HashSet<>();

        for(int candy : candyType){
            set.add(candy);
        }

        return Math.min(set.size(), candyType.length / 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candies: ");
        int n = sc.nextInt();

        int[] candyType = new int[n];

        System.out.println("Enter candy types:");

        for(int i = 0; i < n; i++){
            candyType[i] = sc.nextInt();
        }

        int result = distributeCandies(candyType);

        System.out.println("Maximum different candies Alice can eat: " + result);

        sc.close();
    }
}