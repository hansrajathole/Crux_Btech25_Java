package Lec5;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int star = n;

        while (row<n) {
            
            // Star 
            int col = 0;
            while(col<star){
                System.out.print("* ");
                col++;
            }

            // Next line prep..

            System.out.println();
            row++;
            star--;
        }
    }
}
