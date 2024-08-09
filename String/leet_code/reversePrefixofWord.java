package Java.String.leet_code;

//https://leetcode.com/problems/reverse-prefix-of-word/
public class reversePrefixofWord {
 public static void main(String[] args) {
    
 }   

public String reversePrefix(String word, char ch) {
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<word.length();i++){
        if(word.charAt(i) == ch){
            String str=word.substring(0,i+1);
            str=reverse(str);
            //ans= str + word.substring(i+1,word.length());
            ans.append(str);
            ans.append(word.substring(i+1,word.length()));
            return ans.toString();  
        }
    }
    return word;
}
public String reverse(String str){
    StringBuilder word= new StringBuilder(); 
    for(int i=str.length()-1;i>=0;i--){
        word.append(str.charAt(i));
    }
    return word.toString();
}
}
