package Java.Recursion.String_recursion;

import java.util.ArrayList;



public class SubSeq_String {
    public static void main(String[] args) {
        String s="abc";
        //subsequence("", s);
         ArrayList<String>list =new ArrayList<>();
         System.out.println(sub_seq("", s,list));
       // System.out.println(sub_seq_inbody("", s));
        //subseq_ascii("", s);
        //System.out.println(sub_seq_ascii("", s));
    
    }
    static void subsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        //two recursion calls 
        //one for adding and other for removing

        subsequence(p+ ch , up.substring(1));
         subsequence(p, up.substring(1));
    }

    static ArrayList<String> sub_seq(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            
             list.add(p);
             return list;
        
        }
        char ch=up.charAt(0);

        //two recursion calls 
        //one for adding and other for removing

        sub_seq(p+ ch , up.substring(1),list);
         sub_seq(p, up.substring(1),list);
        return list ;
        }

        static ArrayList<String> sub_seq_inbody(String p,String up){
            if(up.isEmpty()){
                ArrayList<String>list=new ArrayList<>();
                 list.add(p);
                 return list;
            
            }
            char ch=up.charAt(0);
    
            //two recursion calls 
            //one for adding and other for removing
    
        ArrayList<String> left=new ArrayList<>();
        left=sub_seq_inbody(p+ ch , up.substring(1));
        ArrayList <String> right=new ArrayList<>();
        right=sub_seq_inbody(p, up.substring(1));
     
        left.addAll(right);
        return left;
     } 
     static void subseq_ascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        //two recursion calls 
        //one for adding and other for removing

        subseq_ascii(p+ ch , up.substring(1));
        
        subseq_ascii(p, up.substring(1));
        subseq_ascii(p+(ch+0), up.substring(1));  
    }  

    static ArrayList<String> sub_seq_ascii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
             list.add(p);
             return list;
        
        }
        char ch=up.charAt(0);

        //two recursion calls 
        //one for adding and other for removing

    ArrayList<String> first=sub_seq_ascii(p+ ch , up.substring(1));
    ArrayList <String> second=sub_seq_ascii(p, up.substring(1));
    ArrayList <String> third=sub_seq_ascii(p+(ch+0), up.substring(1));
    first.addAll(second);
    first.addAll(third);
    return first;
 } 

}
