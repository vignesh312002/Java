package Java.LinkedList.leetCode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class duplicatesInLinkedList {
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
    public void duplicates(){
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            if(temp.data ==temp.next.data ){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;

            }
        }
            tail=temp;
            tail.next=null;    
     
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
    // System.out.print("START ->  ");
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.println(" END");
}
    public static void main(String[] args) {
        duplicatesInLinkedList list=new duplicatesInLinkedList();
        list.InsertLast(1);
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(4);
        list.InsertLast(4);
        list.display();
        list.duplicates();
        list.display(); 
    }
}
