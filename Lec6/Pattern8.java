

public class Pattern8 {
    public static void main(String[] args) {
        
        int n = 5;
        int row = 0;

        while (row<n) {
            
            // Star Print
            int col = 0;
            while (col<n) {
                if(col == row || (col+row == n-1)){
                     System.out.print("* ");
                }else{
                     System.out.print("  ");
                }
                col++;
            }


            // Next line prep...
            System.out.println();
            row++;
        }
    }
}
