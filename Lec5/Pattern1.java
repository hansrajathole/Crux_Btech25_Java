package Lec5;

public class Pattern1 {
    public static void main(String[] args) {
        
        int n = 5;
        int row = 0;

        while (row<n) {
            
            // Star Print
            int col = 0;
            while (col<n) {
                System.out.print("* ");
                col++;
            }


            // Next line prep...
            System.out.println();
            row++;
        }
    }
}
