public class defanging_ip_adress {
    public static void main(String[] args) {
        String str="1.1.1.1";
        System.out.println(str.replace(".", "[.]"));
    }
}
