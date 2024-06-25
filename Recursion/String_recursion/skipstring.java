package Java.Recursion.String_recursion;

public class skipstring {
    public static void main(String[] args) {
        String s="hellappleo";
        System.out.println(skipAppnotApple(s));
    }
    static String skipstr(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipstr(s.substring(5));
        }
        else{
            return s.charAt(0)+skipstr(s.substring(1));
        }
    }
    static String skipAppnotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppnotApple(s.substring(3));
        }
        else{
            return s.charAt(0)+skipAppnotApple(s.substring(1));
        }
    }
}
