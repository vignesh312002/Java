package Java.LinkedList.leetCode;


public class reversal_of_linkedlist {
    private Node head;
    private Node tail;
    private int size;
    private void reverse(Node node){
        if(node==tail){
          head=tail;
          return ;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
      }
      public void inplace(){
        //https://leetcode.com/problems/reverse-linked-list/description/
        //see leetcode for detail 
        Node prev=null;
        Node current =head;
        Node next=current.next;
        while(current !=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
      }
      //https://leetcode.com/problems/reverse-linked-list-ii/solutions/
    public Node reverseBetween(Node head, int left, int right) {
        if(left==right){
            return head;
        }
        //initially theprev is null and current is head
        Node prev=null;
        Node current=head;

        for (int i = 0; current!=null && i < left-1 ; i++) {
            prev=current ;
            current=current.next;
        }
        Node last=prev;
        Node newend=current ;

        // then the reversal between the left and right 
            Node next=current.next;
        for (int i = 0; current!=null && i < right-left+1; i++) {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
             
        newend.next=current;
        return head;


    }
    
      private class Node{

        private int data;
        private Node next;

    public Node(int data) {
            this.data = data;
            
        }
    public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
     }
}
