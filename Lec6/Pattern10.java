

class Pattern10 {
    public static void main(String [] args){

        int n = 5;
        int space = 0;
        int star = n*2-1;
        int row = 0;
        while(row<n){
            // space 
            int i = 0 ;
            while(i<space){
                System.out.print("  ");
                i++;
            }

            // Star
             int j = 1 ;
            while(j<= star){
                
                    System.out.print("* ");
               
                j++;
            }
            

            // nest line prep
            System.out.println();
            row++;
            space++;
            star -=2;

        }
    }
}