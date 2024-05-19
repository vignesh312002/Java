public class q2_find {
    public static void main(String[] args) {
    int arr[]={2,2,3,3,4,4,5};
    int arr1[]={2,-2,4,3,-3,-4,5};
    System.out.println(find(arr));    
    System.out.println(find_2(arr1));
}
    static int find(int arr[]){
        int unique_number=0;
        for(int i:arr){
            unique_number =unique_number ^ i;
        }
        
        return unique_number;

    }
    static int find_2(int arr[]){
        int unique_number=0;
        for(int i:arr){
            unique_number =unique_number + i;
        }
        
        return unique_number;

    }  

}
