import java.util.*;

class April11 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;

        for (int i = 0; i < n / 2; i++) {
            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
            minAvg = Math.min(minAvg, avg);
        }

        return minAvg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        April11 obj = new April11();
        System.out.println("Minimum Average: " + obj.minimumAverage(nums));
    }
}