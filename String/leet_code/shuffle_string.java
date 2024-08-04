package Java.String.leet_code;

//import java.util.Arrays;

public class shuffle_string {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,2,1,3};
        String s="codeleet";
        System.out.println(restoreString(s,arr));
            
    }
    public static String restoreString(String s, int[] indices) {
        
        char[] t =new char[s.length()];
 
         for(int i=0;i<t.length;i++){
             t[indices[i]]=s.charAt(i);
         }
         String str=new String(t);
         return str ;
     }
    
    
}
