package Java.Recursion.Recursion_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class dice_roll {
    public static void main(String[] args) {
        dice("", 4);
        
        //System.out.println(Return_dice("", 4));

        //diceFaces("", 7, 8);

        //dice_Faces_Return("", 4, 6);

        //diceF(0, 2,7 ,6 );
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6 && i<=target ;i++){
        dice(p + i, target-i);
        }
    } 
    static List<String> Return_dice(String p,int target){
        if(target==0){
            List<String> list=new ArrayList<>(); 
            list.add(p);
            return list;
        }
        List<String> list=new ArrayList<>();
        for(int i=1;i<=6 && i<=target ;i++){
         
            list.addAll(Return_dice(p + i, target-i));
        }
    return list;
}
    static void diceFaces(String p,int target ,int face){
        if(target==0){
            System.out.println(p);
            return ;
        }   
        for(int i=1;i<=face && i<=target ;i++){
        diceFaces(p + i, target-i,face);
        }
    }
    static List<String> dice_Faces_Return(String p,int target,int faces){
        if(target==0){
            List<String> list=new ArrayList<>(); 
            list.add(p);
            return list;
        }
        List<String> list=new ArrayList<>();
        for(int i=1;i<=faces && i<=target ;i++){
         
            list.addAll(dice_Faces_Return(p + i, target-i, faces));
        }
    return list;
    
}
// static void diceF(int p, int n,int target ,int face){
//     //diceF(0, 2, 7, 6 );
//     if(target==0){
//         System.out.println(p);
//         return ;
//     }   
//     for(int i=1;i<=face && i<=target ;i++){
//     diceF(i+target-i,n, target-i,face);
//     }
// }
}