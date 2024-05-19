
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>(); 
    
   // list.add(10);
    //list.add(20);

    
    //list.set(0, 1);
    //System.out.println(list.size());
    //System.out.println(list);
    for (int i = 0; i < 5; i++) {
        list.add(sc.nextInt());
        
    }
    for (int i = 0; i < 5; i++) {
        System.out.print(list.get(i)+" ");
    }

sc.close();
    }
}
