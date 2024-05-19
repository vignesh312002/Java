import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        
        System.out.println('a'+'b');//character
        System.out.println('a'+"b");//string
        System.out.println('a'+3);//give 97+3=100
        System.out.println((char)('a'+3));//gives d
    
        System.out.println("a"+1);//will print both as a1\
        // the integer is changed to Integer and then tostring()
            //then "a" +"1" answer is a1
        System.out.println("vignesh"+ new ArrayList<>());    
    //  IF THERE IS AN OBJJECT IT WILL CALL TOSTRING METHOD()

    //System.out.println(new ArrayList<>()+new Integer(56));// it throw error
    
    // the + operator is only applied for PRIMITIVES and any ONE IS STRING among the TWO
    // atleast one operand should be STRING
    System.out.println(new ArrayList<>() + "" + new Integer(56));
    }

}

