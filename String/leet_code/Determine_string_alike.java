import java.util.HashSet;
import java.util.Set;

public class Determine_string_alike {
    public static void main(String[] args) {
        String s="book";
        System.out.println(halvesAreAlike(s));
    }

    // time complexity of o(N2)
    public  static boolean halvesAreAlike(String s) {
        String str=s.toLowerCase();
        int count1=0;
        int count2=0;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)=='a' || str.charAt(i)== 'e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
            count1++;        
            }
        }
        for(int i=str.length()/2;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)== 'e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
            count2++;        
            }
        }
        return count1 == count2;
    }

   // time complexity of O(n)
    public boolean halves(String s) {
        String str = s.toLowerCase();
        int length = str.length();
        int half = length / 2;
        int count1 = 0;
        int count2 = 0;
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        for (int i = 0; i < half; i++) {
            if (vowels.contains(str.charAt(i))) {
                count1++;
            }
            if (vowels.contains(str.charAt(i + half))) {
                count2++;
            }
        }
        
        return count1 == count2;
}
