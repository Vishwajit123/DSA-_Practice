// ------------------------------------ rotate a 2D Matrix by 90 Degrees ------------------------------------

import java.util.*;

class Feb5 {

                              

    public void rotate(int[][] matrix) {
        int n = matrix.length;
                            
        
                              // 1 2 3  
                              // 4 5 6
                              // 7 8 9
                             

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

                            // 1 4 7
                            // 2 5 8 
                            // 3 6 9  
        
        
        for(int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
                    // reverse columns 
                                // 7 4 1
                                // 8 5 2
                                // 9 6 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Feb5 obj = new Feb5();
        obj.rotate(matrix);

        System.out.println("Rotated Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
