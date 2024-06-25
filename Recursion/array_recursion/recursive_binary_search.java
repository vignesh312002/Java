package Java.Recursion.array_recursion;

public class recursive_binary_search {
    public static void main(String[] args) 
    {
        int arr[]={5,6,7,8,9,10,1,2,3};
        System.out.println(Rsearch(arr, 3, 0, arr.length-1));
    }
    static int Rsearch(int []arr,int target, int s,int e ){
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid] ){
                return Rsearch(arr, target, s, mid-1);
            }
            else{
                    
                return Rsearch(arr, target, mid+1, e);
            }
        }
        if(arr[s]>=arr[mid]){
            if(target>=arr[mid]&& target<=arr[e]){
                return Rsearch(arr, target, mid+1, e);
            }
            else{
                return Rsearch(arr, target, s, mid-1);
            }
        }
        
        
        }
        return -1;
    }
}

