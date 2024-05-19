import java.util.Scanner;

public class largest_number {
 
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //int ans=0;
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
  //  ans=Math.max(a, b);
    //System.out.println(Math.max(ans, c));
    System.out.println(Math.max(c, Math.max(a, b)));

   /* int max=a;
     if(b>max){
      max=b;
    }
     if(c>max){
      max=c;
    }
System.out.println(max);*/
sc.close();
  }  
}
 