public class search_2D {
   public static void main(String[] args) {
    int arr[][]={
        {1,3}
    
        
    };
    System.out.println(searchMatrix(arr,0));
   }
   public static boolean searchMatrix(int[][] matrix, int target) {
    int row=matrix.length; 
        int col=matrix[0].length;
        //BE CAUSIOUS WILL SPECIFING THE ROW AND COL
        if (row == 1) {
            // Check if there's only one column
            if (col == 1) {
                return matrix[0][0] == target;
            } else {
                return binarysearch(matrix, target, 0, 0, col - 1);
            }
        }
        //if(row==1){
          //  return binarysearch(matrix, target,0, 0, col-1);
        //}
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        
        //run the loop till 2 rows are remaining 
        while(rStart < (rEnd-1)){
            int mid =rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return true;
            }
            if(target >matrix[mid][cMid]){
                rStart=mid;
            }
            if(target<matrix[mid][cMid]){
                rEnd=mid;
            }
        }
//after the loop is completed we only have two rows 

        //check whether the target is in the mid col of two rows  
        if(matrix[rStart][cMid]==target){
            return true; //check for 2 
        }
        if(matrix[rStart+1][cMid]==target){
            return true;  //check for 6 
        }
        //search in first half 
        if(target<=matrix[rStart][cMid-1]){
            return binarysearch(matrix, target, rStart, 0, cMid-1);
        }
        //searfch in second half
        if(target>=matrix[rStart][cMid+1]&& target <= matrix[rStart][col-1]){
            //if the target is greater than 3 and the target shoulfd be lessert than the end valuse of col
            return binarysearch(matrix, target, rStart, cMid+1, col-1);
        }
        //search in third half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarysearch(matrix, target, rStart+1, 0, cMid-1);
        }
        //search in fourth half;
        /*if(target>=matrix[rStart+1][cMid+1] && target<=matrix[cMid+1][col-1]){
            return binarysearch(matrix, target, rStart, cMid+1, col-1);
        }*/




        return binarysearch(matrix, target, rStart+1, cMid+1, col-1);
    } 
    // FUNCTION
    // searching in the row with colStart and colEnd 
    static boolean binarysearch(int[][]matrix,int target,int row ,int cStart,int cEnd ){
        while(cStart<=cEnd)
        {
            int mid =cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target)
            {
                return true;
            }
            if(target>=matrix[row][mid])
            {
                cStart=mid+1;

            }
            if(target<=matrix[row][mid])
            {
                if(mid==0){
                    return false;
                }
                cEnd=mid-1;
            }    
        }
    return false;    
    } 
}
