package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class Letter_combination {
    public static void main(String[] args) {
        //combination("", "");
       System.out.println(letterCombinations("23"));
    }
    static void combination(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
       
        
        int digit= up.charAt(0) -'0'; 
        int i=(digit-2)*3; 
        if(digit > 7 ){
            i=i+1;

        }   
        int len=i+3;
        if(digit == 7 || digit ==9){
            len=len+1;
        } 

        for (; i < len; i++) {
           
            char ch =(char)( 'a' + i);
            combination(p +ch, up.substring(1));
        } 
    }

    public  static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
         
        return combination_list("",digits);
    }
     public static List<String> combination_list(String p, String up) {
        
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit = up.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }
        
        ArrayList<String> list = new ArrayList<>();
                
        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(combination_list(p+ch, up.substring(1)));
        }
        
        return list;
        
    }

}
