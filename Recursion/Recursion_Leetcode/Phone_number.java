package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class Phone_number {
    public static void main(String[] args) {
     combination("","12");

    //    List<String> list =new ArrayList<>();
    //    combination_list("", "12", list);
    //    System.out.println(list);

    // System.out.println(combination_list_inbody("", "12"));
 // System.out.println(combination_count("","12"));      
    }
    static void combination(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        //for a string character 
        // char ch= up.charAt(0);

        //here we need the digit 
        int digit= up.charAt(0) -'0'; 
        //it will convert '1' to  1
        //ex- '1' - '0'  49 - 48 == 1       
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            //here if digit is 1 
            // ( 1-1 )* 3  ; 1 * 3
            // so the range will be [0 , 3)
            char ch =(char)( 'a' + i);
            combination(p +ch, up.substring(1));
        } 
    }

    static List<String> combination_list(String p,String up,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        //for a string character 
        // char ch= up.charAt(0);

        //here we need the digit 
        int digit= up.charAt(0) -'0'; 
        //it will convert '1' to  1
        //ex- '1' - '0'  49 - 48 == 1       
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            //here if digit is 1 
            // ( 1-1 )* 3  ; 1 * 3
            // so the range will be [0 , 3)
            char ch =(char)( 'a' + i);
            combination_list(p +ch, up.substring(1),list);
        } 
        return list;
    }
    static List<String> combination_list_inbody(String p,String up){
        
        if(up.isEmpty()){
            List<String> res =new ArrayList<>();    
            res.add(p);
            return res;
        }
        //for a string character 
        // char ch= up.charAt(0);

        //here we need the digit 
        int digit= up.charAt(0) -'0'; 
        //it will convert '1' to  1
        //ex- '1' - '0'  49 - 48 == 1
        List<String> list=new ArrayList<>();       
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            
            //here if digit is 1 
            // ( 1-1 )* 3  ; 1 * 3
            // so the range will be [0 , 3)
            char ch =(char)( 'a' + i);
            list.addAll(combination_list_inbody(p +ch, up.substring(1)));
            
        } 
      
    return list;
    }

    static int combination_count(String p,String up){
        if(up.isEmpty()){
           // System.out.println(p);
            return 1 ;
        }
        //for a string character 
        // char ch= up.charAt(0);

        //here we need the digit 
        int count =0;
        int digit= up.charAt(0) -'0'; 
        //it will convert '1' to  1
        //ex- '1' - '0'  49 - 48 == 1       
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            //here if digit is 1 
            // ( 1-1 )* 3  ; 1 * 3
            // so the range will be [0 , 3)
            char ch =(char)( 'a' + i);
            count=count+combination_count(p +ch, up.substring(1));
        }
        return count ;  
    }

}
