public class string_palindrome {
    public static void main(String[] args) {
       String stri="malayalam"; 
        System.out.println(palindrome(stri));
        System.out.println(two_pointer(stri));
    }
    static boolean palindrome(String str){
        String ans="";
        for (int  i =str.length()-1 ; i >=0 ; i--) {
            ans= ans+ str.charAt(i);

        }
        if(str.equals(ans)){
            return true;
        }
       return false; 
    }
    static boolean two_pointer(String str){
        str=str.toLowerCase();
        if(str == null || str.length()==0){
            return true;
        }
        for (int  i =0 ; i <=str.length()/2 ; i++) {
            char start =str.charAt(i); // it is incrementing 
            char end=str.charAt(str.length()-1-i); // it is decrementing 

            if(start!=end ){
                return false;
            }

        }
        return true;    
}
}