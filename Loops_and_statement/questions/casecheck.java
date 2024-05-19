import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch =sc.next().trim().charAt(0);//charat convert to character and get index 1

        if(ch>='a' && ch<='z'){
            System.out.println("lowercaser");
        }
        else{
            System.out.println("uppercase");
        }
        sc.close();
    }
}
