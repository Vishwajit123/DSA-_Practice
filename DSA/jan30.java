import java.util.*;

class jan30 {

    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights.clone();   
        Arrays.sort(expected);              

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        jan30 obj = new jan30();  
        int result = obj.heightChecker(heights);

        System.out.println("Number of students in wrong positions: " + result);

        sc.close();
    }
}
