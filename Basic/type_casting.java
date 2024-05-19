import java.util.Scanner;

public class type_casting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // float num=sc.nextFloat();
        // System.out.println(num);
        
        //TYPE CONVERSION
        // condition 1 - compatible types 
        // condition 2 - the destination types should be greater than the source type
            // int can be converted to float ,because float is greater than the integer
   
        //TYPE CASTING  
        // Also known as Narrowing 
        //converting the int to float 
        //compressingthe bigger number to smaller type
        int number= (int)65.23f;
        System.out.println(number); 

    //AUTOMATIC TYPE PROMOTION 
    int a=257 ; //the the byte range 256
    byte b= (byte)a ;
    System.out.println(b) ; // 257 % 256 gives 1       
    // ans willbe 1 , because byte max value is 256 if u try to cinvert it to 257
    // it will provide the reminder of the two values 257 % 256 gives 1 
    byte m=20;
    byte c=20;
    int d=m*c;
    System.out.println(d);//automatic 

    //  UNICODE 
    int character='A';
    System.out.println(character); //wil give 65 bcoz it is unicode 
    // is a unique number for each and every language words etc....
    System.out.println("你好");
    
    byte by=42;
    char ch='c';
    short s=1024;
    int i=5000;
    float f=234.45f;
    double dou=235235.4;
    double result=(by+ch)*(s*i)/(f+dou);
    System.out.println((by+ch)+" "+(s+i)+" "+(f+dou));
    System.out.println(result);
    sc.close();
}
}
