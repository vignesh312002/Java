public class find_num_wiht_even_num_digit {
    
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        System.out.println(findnumbers(arr));
        //System.out.println((int)Math.log10(2345)+1);
        //nof digits in number ;
    }
    static int findnumbers(int []arr){
    int ans=0;
    
     for (int i = 0; i < arr.length; i++) {
        int count=0;
        while (arr[i]!=0) {

            arr[i]=arr[i]/10;
            count++;
        }
        if(count %2==0){
             ans++;
         }
     }
    return ans;
    }
}
    //  ANOTHER APPROACH IS 
        // first write a function to fiund the number of digits
        // second write a function to check even or not
   //see leetcode for the answer

