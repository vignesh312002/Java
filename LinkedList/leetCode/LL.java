package Java.LinkedList.leetCode;


public class LL {
    private Node head;
    private Node tail;
    public int size;
    private class Node{

        private int data;
        private Node next;

    public Node(int data) {
            this.data = data;
            
        }
    // public Node(int data,Node next){
    //         this.data=data;
    //         this.next=next;
    //     }
     }
     public void InsertFirst(int data){
        Node node =new Node(data);
        //we are pointing the next node (new node to head)
        node.next=head;
        head =node ;
        size++;
        if(tail==null){
            //  (tail ==null)it the first item being added
            tail=node;
        }
    }
     public void InsertLast(int data){
        Node node =new Node(data);
        if(tail==null){
            InsertFirst(data);
            return ;  
        }
        tail.next =node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp=head;
         System.out.print("START ->  ");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(" END");
    
}
public static LL merge(LL first,LL second){
    Node f=first.head;
    Node s=second.head;
    LL list =new LL();
    while(f!=null && s!=null){
        if(f.data<s.data){
            list.InsertLast(f.data);
            f=f.next;
        }
        else{
            list.InsertLast(s.data);
            s=s.next;
        }

    }
    while (f!=null) {
        list.InsertLast(f.data);
        f=f.next;
    }
    while (s!=null) {
        list.InsertLast(s.data);
        s=s.next;
    }
    return list;
}
//https://leetcode.com/problems/linked-list-cycle/
  public static int hasCycle(Node head) {
   Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                Node temp=slow.next;
                int length=0;
                while(temp!=fast){
                    
                    temp=temp.next;
                    length++;
                }
                return length;
            }
        }

        return 0;    
    }
//https://leetcode.com/problems/linked-list-cycle-ii/
public Node detectCycle(Node head) {
    Node fast = head;
     Node slow = head;

     while (fast != null && fast.next != null) {
         fast = fast.next.next;
         slow = slow.next;

         if (fast == slow) {
             slow = head;  // Set slow to head
             while (slow != fast) {
                 slow = slow.next;
                 fast = fast.next;
             }
             return slow;  // Both pointers are now at the start of the cycle
         }
     }

     return null;  // No cycle
 }
//https://leetcode.com/problems/happy-number/description/

public static  boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=square(n);
            fast=square(square(n));// it will go two positions
        }while(slow !=fast);
        
        if(slow==1){
            return true;
        }
        return false;  
}
public static int square(int num){
    int ans=0;
    while(num>0){
        int rem=num%10;
        ans=ans+rem*rem;
        num=num/10;
    }
    return ans;
}
//https://leetcode.com/problems/middle-of-the-linked-list/
public Node middleNode(Node head) {
        Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
}
public static void main(String[] args) {
    LL first =new LL();
    LL second =new LL();

    first.InsertLast(1);
    first.InsertLast(3);
    first.InsertLast(5);

    second.InsertLast(1);
    second.InsertLast(2);
    second.InsertLast(9);
    second.InsertLast(14);
    LL mergelist=LL.merge(first,second);
    mergelist.display();

}
}
