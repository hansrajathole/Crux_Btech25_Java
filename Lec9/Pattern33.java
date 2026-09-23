

package Lec9;

/**
 * Pattern33
 */
public class Pattern33 {

    public static void main(String[] args) {
        
        int n = 10;
        int space = n-1;
        int star = 1;
        int num = 10;
        int row = 0;
        

        while (row<n) {

            //Space 
            int i = 0;
            while (i<space) {
                System.out.print("  ");
                i++;
            }

            int j = 0;
            while (j<star) {
                if(num== n){
                    System.out.print("0 ");
                }else{
                    System.out.print(num+" ");
                }

                if(j<star/2){
                    num++;
                }else{
                    num--;
                }


                j++;
            }

            // nest line
            System.out.println();
            space--;
            star+=2;
            row++;
            
        }
        

    }
}