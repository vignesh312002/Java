package Java.String.leet_code;

//import java.util.Arrays;

//import java.util.Arrays;

public class reverse_words_in_string3 {
 public static void main(String[] args) {
 String s="Mr Ding";
     
     System.out.println(reverseWords(s));
 }

 public static String reverseWords(String s) {
    String []str=s.split(" ");
    //System.out.println(Arrays.toString(str));
    String res="";
    for (int i = 0; i < str.length; i++) {
        String reverse="";
        char[] ch=str[i].toCharArray();
        for (int j = 0; j < ch.length; j++) {
            reverse=str[i].charAt(j)+reverse;
        }
        res=res+" "+reverse;
    }
    return res.trim() ;
 }
//  public String reverseWords(String s) {
//     String[] words = s.split(" ");
//     StringBuilder result = new StringBuilder();

//     for (String word : words) {
//         StringBuilder reverseWord = new StringBuilder(word);
//         reverseWord.reverse();
//         result.append(reverseWord).append(" ");
//     }

//     return result.toString().trim();
// }

 
}
