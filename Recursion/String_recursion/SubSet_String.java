package Java.Recursion.String_recursion;

public class SubSet_String {
    public static void main(String[] args) {
       String s= "abc";
       subset_string(s);
     
    }
    static void subset_string(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(s.charAt(j2));
                }
                System.out.println();
            }
        }

    }
}
