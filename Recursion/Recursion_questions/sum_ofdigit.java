package Java.Recursion.Recursion_questions;

public class sum_ofdigit {
    public static void main(String[] args) {
        int number =12345;
        System.out.println(sumDigit(number));
    }
    static int sumDigit(int num){
        if(num==0){
            return 0;
        }
        return num %10 + sumDigit(num/10);
    }
}
