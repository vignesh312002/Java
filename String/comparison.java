public class comparison {
    public static void main(String[] args) {
        String a="vignesh";
        String b="vignesh";
        System.out.println(a==b);//true

        //
        String name1=new String("vignesh");
        String name2=new String("vignesh");
        //even though the both are same the returb false
        System.out.println(name1==name2);//false
        //because new keword creates new object in heap 
        System.out.println(name1.equals(name2));//true
    }
}
