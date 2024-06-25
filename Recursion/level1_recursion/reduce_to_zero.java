package Java.Recursion.level1_recursion;

public class reduce_to_zero {
public static void main(String[] args) {
    System.out.println(numberOfSteps(123));

}
//see leetocde for reference
/*public static int numberOfSteps(int num){
    if(num==0){
        return ;
        --NOTE--//here we need to return the no of count(step)
        --NOTE --//so we cant add a count in the function argument so
        // we write another function and call that function inside
    }
    if(num%2==0){   
        
        return 1+numberOfSteps(num/2);
    }
    else{
        return 1+ numberOfSteps(num-1);
    }
}*/
   public static int numberOfSteps(int num) {
        return help(num,0);
    }
    public static int help(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){   
            
            return help(num/2,count+1);
        }
        else{
            
            return help(num-1,count+1);
        }
    }
}

