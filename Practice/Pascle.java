class Pascle{
    public static void main(String[] args){
        int n=4;

        for(int i=0; i<n; i++){
            for(int space=0; space<n-i-1; space++){
                System.out.print(" ");

            }
            int val=1;
            for(int j=0; j<=i; j++){
                System.out.print(val + " ");
                val=val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}