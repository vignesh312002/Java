import java.util.Arrays;

public class String_search {
    public static void main(String[] args) {
        String str="vignesh";
        System.out.println(search(str, 'g'));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean search (String str,char ch){
        if(str.length()==0){
            return false;
        }
        /*for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ch){
                return true;
            }
            
        }*/
        for (char c : str.toCharArray()) {
            if(c == ch){
                return true; 
            }
        }
        return false;  
    }
}
