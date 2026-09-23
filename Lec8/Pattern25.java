

public class Pattern25{
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n-1;
        int row = 0;
       
        while(row<n){
            //space 
            int i = 0 ;
            while(i<space){
                System.out.print("\t");
                i++;
            }

            // star
             int num = 1;
            int j = 0;
            while(j<star){
                System.out.print(num+"\t");
                num++;
                j++;
            }

            System.out.println();
            space--;
            star += 2;
            row++;

        }
    }
}