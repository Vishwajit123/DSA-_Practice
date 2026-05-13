import java.util.Scanner;

class May13 {

    public int distanceTraveled(int mainTank, int additionalTank) {

        int distance = 0;

        while (mainTank >= 5) {

            
            mainTank -= 5;
            distance += 50;

           
            if (additionalTank > 0) {
                mainTank += 1;
                additionalTank--;
            }
        }

        
        distance += mainTank * 10;

        return distance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main tank fuel:");
        int mainTank = sc.nextInt();

        System.out.println("Enter additional tank fuel:");
        int additionalTank = sc.nextInt();

        May13 obj = new May13();

        System.out.println("Total Distance = " +
                obj.distanceTraveled(mainTank, additionalTank));
    }
}