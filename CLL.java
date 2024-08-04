package Java.LinkedList;

public class CLL {
    private Node head;
    private  Node tail;
    int size;


    public void insert(int data){
        Node node =new Node(data);
        if(head==null){
            head=node;
            tail=node;
            return ;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void deleteFirst(){
        head=head.next;
        tail.next=head;
     size--;
     }
     public void deleteMiddle(int index){
    
        if (index==0) {
            deleteFirst();
    
        }
        else if (index==size){
            deleteLast();
        }
        else{
        Node temp=get(index);
        temp.next=temp.next.next;
             size--;
        }
    }
    public void deleteLast(){//if you want ot delete the last element 
        //u must get I step before
    Node temp=head;
    for(int i=0;i<size-2;i++){
    temp=temp.next;
    }
    temp.next=head;
    tail=temp;
    }

    public Node get(int index){
    Node temp=head;
    for(int i=1;i<index;i++){
    temp=temp.next;
    }
    return temp;
    }
    public void display(){
        // can also print using the dowhile loop 
        Node temp=head;
        if(temp==null){
            System.out.println("empty");
        }
        else{
            while (true) {
                System.out.print(temp.data +" -> ");
                temp=temp.next;
                if(temp == head){
                    System.out.print("HEAD");
                    break;
                }
            }
        }
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
