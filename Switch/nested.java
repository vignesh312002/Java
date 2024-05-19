import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId=sc.nextInt();
        String dept=sc.next();
        switch (empId) {
            case 1:
              System.out.println("vignesh");
                switch (dept) {
                    case "automobile":
                        System.out.println("engineer");
                        break;
                
                    default:
                    System.out.println("not found");
                        break;
                }
                break;
            case 2:
                System.out.println("hari");

        
            default:
            System.out.println("not found");
                break;
        }
        sc.close();
    }
}
