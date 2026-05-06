import java.util.*;

class May6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rowIndex = sc.nextInt();   
        
        List<Integer> row = new ArrayList<>();
        
        long value = 1;
        row.add(1);
        
        for (int i = 0; i < rowIndex; i++) {
            value = value * (rowIndex - i) / (i + 1);
            row.add((int) value);
        }
        
        
        for (int num : row) {
            System.out.print(num + " ");
        }
    }
}