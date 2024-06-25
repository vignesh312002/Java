package Java.Recursion.String_recursion;

public class skipcharacter {
    public static void main(String[] args) {
        String str="baccad";
      //System.out.println(skipCharacter(str));  
      //String ans="";
      System.out.println(recSkipCharater( str));
        
    }
    public static String skipCharacter(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                continue;
            }
            else{
                ans=ans+s.charAt(i);
             
            }
        }
        return ans;
    }
    public  static String recSkipCharater(String s){
        if(s.isEmpty()){
            
            return "";
        }
        char ch=s.charAt(0);
        if(ch== 'a'){
            return recSkipCharater( s.substring(1));
        }
        else{
            return ch+ recSkipCharater( s.substring(1));
        }

    }
}
