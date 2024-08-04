package Java.String.leet_code;

public class SortTheSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public  static String sortSentence(String s) {
    

        String []str=s.split(" ");
        String ans[]= new String[str.length];
        for(int i=0;i<str.length;i++){
            for(int j=0;j< str[i].length();j++){
                char ch= str[i].charAt(j);
               if(Character.isDigit(ch)){
                int count= ch -'0';
                ans[count-1]=str[i].substring(0,j);
               }
                
            }
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            result.append(ans[i]);
            if(i<ans.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
