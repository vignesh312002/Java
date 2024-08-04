package Java.String.leet_code;

public class two_StringArray_equivalent {
    public static void main(String[] args) {
       String []word1={"a","cb"};
       String[] word2={"ab","c"};
      // System.out.println(word2.length);

    
       System.out.println(arrayStringsAreEqual(word1,word2));
    }
    /*public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        if(word1.length>1){
            for(int i=0;i<word1.length;i++){
                 str1=str1+word1[i];
            }
        }
        else{
            str1=word1[word1.length-1];
        }
        if(word2.length>1){
            for(int i=0;i<word1.length;i++){
                str2=str2+word2[i];
            }
        }
        else{
            str2=word2[word2.length-1];
        }
       if(str1.equals(str2)){
        return true;
       }
       else{
        return false;
       }
    */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2= new StringBuilder();
        for(int i=0;i<word1.length;i++){
            str1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            str2.append(word2[i]);
        }
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        return false;
    }
}