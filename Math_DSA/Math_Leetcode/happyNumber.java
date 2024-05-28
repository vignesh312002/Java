import java.util.HashSet;
import java.util.Set;

public class happyNumber {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
      public static  boolean isHappy(int n) {
      Set<Integer> seen =new HashSet<>();

      while (n!=1 && !seen.contains(n)){
        seen.add(n);
        n=square(n);
      }
      return n == 1  ; // if final answer is 1 true else it will return false 
   }
  public static int square(int number) {
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            totalSum += digit * digit;
            number /= 10;
        }
        return totalSum;
    }
}
