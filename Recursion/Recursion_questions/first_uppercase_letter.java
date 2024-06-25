package Java.Recursion.Recursion_questions;


//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class first_uppercase_letter {
    public static void main(String[] args) {
        String str="hellO";
        //first(str);
        recursive(str, 0);

    }
    static void first(String str){
        for (int i = 0; i < str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
        
    }
    static void recursive(String str,int index){
        if(index==str.length()){
            return ;

        }
        if(Character.isUpperCase(str.charAt(index))){
            System.out.println(str.charAt(index));
        }
        recursive(str, index+1);
    }
}
