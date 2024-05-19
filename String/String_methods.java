import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        String name="rahul hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('g'));
        //"       vigensh      ".strip(); // in java 11 
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
