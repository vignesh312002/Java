package Java.Recursion.Recursion_questions;

public class length_ofString {
    public static void main(String[] args) {
       String str ="hello";
        System.out.println(lengthString(str));
    }
    static int lengthString(String str){
        
        if(str.equals("")){
            return 0;
        }
        
        
        return  lengthString(str.substring(1))+1;
        
    }

}
