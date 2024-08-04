package Java.Arrays.Array_leetcode;

//import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class check_if_panagram {
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    
    // public static boolean checkIfPangram(String sentence) {
    //     char []arr=new char[26];
    //     for(int i=0;i<26;i++){
    //         char ch=(char)('a'+i);
    //         arr[i]=ch;
    //     }   
    //     //System.out.println(Arrays.toString(arr));
    //     char []array = sentence.toCharArray();
    //     //System.out.println(Arrays.toString(array));
        
    //     int count =0;
    //     for (int i = 0; i < arr.length; i++) {
    //        for(int j=0;j<array.length;j++){
    //         if(arr[i]==array[j]){
    //             count++;
    //         }
    //        } 
    //     }
    //     if(count>=26){
    //         return true;
    //     }
    //     return false;

    // }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> seen =new HashSet<>();
        if(sentence.length()<26){
            return false;
        }
        else{
        char[]arr =sentence.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            seen.add(arr[i]);
        }
        if(seen.size()==26){
            return true;
        }
        return false;
    }
    
    }
}