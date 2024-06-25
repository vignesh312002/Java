package Java.Recursion.Recursion_questions;

public class productOfTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
System.out.println(product(a, b));
    }
    static int product(int num1,int num2){
        if(num1<num2){
            return product(num2, num1);
        }
        if(num2!=0){
            return  product(num1, num2-1)+ num1; //20 + fun call 
            //it willm get called until the num2 becomes 20
            //then it return to the mainfunction  
        }
        else{
            return 0;
        }
        }
    }

