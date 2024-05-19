import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        System.out.println(75);
        System.out.println("vignesh");
        System.out.println(new int[]{1,2,3,4});//it will print the hashcode
        // it will go to thwe object cretion 
            //then the valueof(if null prints null)
                // the stringof (internal method)
        
                //pretty print
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); 
        //function overriding of tostring 
    }
}
