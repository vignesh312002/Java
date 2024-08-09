package Java.String.leet_code;
//https://leetcode.com/problems/faulty-keyboard/
public class FaultyKeyboard {
    

public String finalString(String s) {
    StringBuilder strr = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'i') {
            String str = strr.toString();
            String data = reverse(str);
            strr = new StringBuilder(data);
        } else {
            strr.append(s.charAt(i));
        }
    }
    return strr.toString();
}
public String reverse( String str){
    StringBuilder rev=new StringBuilder();
    for(int i=str.length()-1;i>=0;i--){
        rev.append( str.charAt(i));
    }
    return rev.toString();
}
}