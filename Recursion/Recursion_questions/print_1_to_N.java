package Java.Recursion.Recursion_questions;

import java.util.Scanner;

public class print_1_to_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        number(1,num);
        sc.close();
    }
    static void number(int n,int num){
       
        if(n>=num){
            return ;
        }
        System.out.println(n);
        number(n+1,num);    
}
}