package Java.Pattern;

public class pattern_question {
   public static void main(String[] args) {
    //pattern1(5);
    //pattern2(5);
     // pattern3(5);
     //pattern4(5);
     //pattern5(5);
     // pattern5_way2(5);
     //pattern6(5);
      //pattern7(5);
      pattern30(4);
   }
   //https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
   static void pattern1(int n) {
      for (int i = 0; i < n; i++) 
      {
           for(int j=0;j<n;j++)
           {
               System.out.print("* ");
           }
        System.out.println("");
        
      }
     }

   
   static void pattern2(int n) {
    for (int i =1 ; i <=n; i++) 
    {
         for(int j=1;j<=i;j++) //for(int j=0;j<=i;j++)
         {
             System.out.print("* ");
         }
      System.out.println("");
      
    }
   }
   static void pattern3(int n) {
      for (int i = 1; i <= n; i++) 
      {
           for(int j=i;j<=n;j++)
           {
               System.out.print("* ");
           }
        System.out.println("");
        
      }
     }
     static void pattern4(int n) { //1 12 123 1234 12345
      
      for (int i = 1; i <= n; i++) 
      {
         int k=1;
           for(int j=1;j<=i;j++)
           {
               System.out.print(k +" ");
               k++;
               
           }
        System.out.println("");
        
      }
     }
     static void pattern5(int n) {
      for (int i = 1; i <= n; i++) 
      {
           for(int j=1;j<=i;j++)
           {
               System.out.print("* ");
           }
        System.out.println("");
        
      }
      for (int i = 1; i <n ; i++) {
         for (int j = i; j <n; j++) {
            System.out.print("* ");
         }
         System.out.println("");
      }
     }
     //time complexity 
     static void pattern5_way2(int n) {
      for (int i = 1; i < 2*n; i++) 
      {
         int totalcol;
         if(i>n ){
            totalcol=2*n-i;
         }
         else{
            totalcol=i;
         }
           for(int j=0;j<totalcol;j++)
           {
               System.out.print("* ");
           }
        System.out.println("");
        
      }
     }
     static void pattern21(int n) {
      int k=1;
      for (int i = 1; i <= n; i++) 
      {
           for(int j=1;j<=i;j++)
           {
               System.out.print(k+"  ");
               k++;
           }
        System.out.println("");
        
      }
     }
     static void pattern6(int n) {
      //first decresing space and then increasing start
   
      for (int i = 1; i <= n; i++) 
      {

           for(int j=i;j<=n;j++)
           {
               System.out.print("  "); // here space is important 
                                          // removing 1 space will give PATTERN 10
               
           }
           for (int j = 1; j <=i; j++)
           {
               System.out.print("* ");
           }
           System.out.println("");

        
      }
     }
     static void pattern7(int n) {
      //first increasing space and then decresing start
   
      for (int i = 1; i <= n; i++) 
      {
         for (int j = 1; j <=i; j++)
           {
               System.out.print(" ");// here space is important 
               // removing 1 space will give PATTERN 11
           }
           for(int j=i;j<=n;j++)
           {
               System.out.print("* "); 
               
           }
           
           System.out.println("");

        
      }
     }
     static void pattern13(int n){
      for(int i=1;i<=n;i++){
         for(int j=i;j<=n;j++)
           {
               System.out.print("  "); 
               
           }
         for (int j = 1; j <= n; j++) 
         {
            if(j==1){
               System.out.print("*");
            }
            
         }  
         System.out.println("");
      }
     }
     static void pattern(int n){
      int s=0;
      for(int i=1;i<=n;i++){
         int rs=1;
         for(int j=2;j<=i+1;j++){
            rs=rs+j*2;

         }
        s=s+rs ;
        System.out.println(s);
      }
     }
     static void pattern30(int n){
      
      //int og=n;
      n=2*n;
      for (int i = 1; i <=n; i++) {
         for (int j = 0; j <=n; j++) {
            int everyindex=/*og - */  Math.min(Math.min(i, j),Math.min(n-i,n-j));
            System.out.print(everyindex+ " ");

         }
         System.out.println("");
      }
     }

}
