public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
    //char num=(int)(65);
      //  System.out.println(num);
      System.out.println(convertToTitle(53));
    }
    public static String convertToTitle(int columnNumber) {
        String series="";
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            char ch=(char)('A'+rem);
            series=ch+ series;
            columnNumber=columnNumber/26;

        }
       
        
      return series;
    }
    
}
