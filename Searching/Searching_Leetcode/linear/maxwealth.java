

public class maxwealth {
    public static void main(String[] args) {
        int [][]accounts={{1,2,3},{1,2,3}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            int rowsum=0;//cal each row sum
            for(int j=0;j<accounts[i].length;j++){
              rowsum =rowsum+accounts[i][j];
         }
         if(rowsum>ans){ //checking the row sum with the max
            ans=rowsum;
         }
         
        }
        return ans;
     }
}
 