import java.util.Scanner;

public class switching {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //String fruit=sc.next();
     
        /*if(fruit.equals("mango")){
            System.out.println("king of fruit");
        }*/
        //swithc case canno thave duplicate 
        //if fruit is defined as string then alls the cases must be string 
        
        /*switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
            case "apple":
                System.out.println("sweet red fruit");
                break;
            case "orange":
                System.out.println("recovery fruit");
                break;

            default:
            System.out.println("enter the valid fruit");
        
        }*/
        int day=sc.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("weekday");
            break;
            
            case 6:
            case 7:
            System.out.println("weekend");
            break;
        
            default:
            System.out.println("enter valid day");
        }
        
    sc.close();
    }
}
