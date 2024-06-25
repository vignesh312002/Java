package Java.Recursion.String_recursion;

import java.util.ArrayList;


public class String_Permutation {
   public static void main(String[] args) {
    String str="abc";
    // ArrayList<String> ans=Ret_permutation("", str);
    // System.out.println(ans);
    //System.out.println(permutationCount("",str));
    System.out.println(permutationCountArg("", str, 0));
   }
   static void permutation(String p,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return ;
    }
    char ch=up.charAt(0);

    // variable number of funtion calls
   
   for (int i = 0; i <= p.length(); i++) {
    String first=p.substring(0, i);
    String last=p.substring(i,p.length());
    permutation(first +ch+ last ,up.substring(1));
   }
    

   } 
   static ArrayList<String> Ret_permutation(String p,String up){
    if(up.isEmpty()){
        ArrayList<String> list =new ArrayList<>();
        list.add(p); 
        return list;
        
    }
    char ch=up.charAt(0);

    // variable number of funtion calls
    ArrayList<String> ans= new ArrayList<>();

   for (int i = 0; i <= p.length(); i++) {
        String first=p.substring(0, i);
        String last=p.substring(i,p.length());
        ans.addAll(Ret_permutation(first + ch + last ,up.substring(1)));
   }
    
return ans;
   } 

   static int  permutationCount(String p,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return 1;
    }
    char ch=up.charAt(0);

    // variable number of funtion calls
   int count =0;
   for (int i = 0; i <= p.length(); i++) {
    String first=p.substring(0, i);
    String last=p.substring(i,p.length());
    count=count + permutationCount(first +ch+ last ,up.substring(1));
   }
    
return count;
   }
// PASSING COUNT IN THE ARGUMENT
   static int  permutationCountArg(String p,String up,int count){
    if(up.isEmpty()){
    
        return count+1;
    }
    char ch=up.charAt(0);

    // variable number of funtion calls
   
   for (int i = 0; i <= p.length(); i++) {
    String first=p.substring(0, i);
    String last=p.substring(i,p.length());
    count = permutationCountArg(first +ch+ last ,up.substring(1),count);
   }
    
return count;
   }
}
