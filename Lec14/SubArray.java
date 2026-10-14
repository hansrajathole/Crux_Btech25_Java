

public class SubArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int count = 0;
        for(int start = 0 ; start<arr.length ; start++){
            String str = "";
            for(int end = start ; end <arr.length ; end++){
                str += arr[end]+ " ";
                System.out.println(str);
            }
            
        }

        // System.out.println("Total number of subarray : "+count);
    }
}