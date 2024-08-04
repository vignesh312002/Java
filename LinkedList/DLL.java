package Java.LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    public int size;
    //insertin at first

    public void addFirst(int data){
        Node node=new Node(data);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    //add last
    public void addLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            node.prev=null;
        }
        
        Node temp=head;
        while (temp.next!=null)  {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        size++;
    }
    public void addMiddle(int after,int data){
        Node p=find(after);
        if(p==null){
            System.out.println("error");
        }
        Node node=new Node(data);
        
        node.next =p.next;
        p.next=node;
        node.prev=p; 
        if(node.next!=null){
            node.next.prev=node;
        }
        size++;

    }
    public void delfirst(){
          
        head=head.next;
          head.prev=null;
          size--;
    }
    public void dellast(){
        Node temp=head; 
        for (int i = 0; i < size-2; i++) {
            temp=temp.next;
        }
        temp.next=null;
    } 
    public void delmiddle(int index){
        Node delete=get(index);
        delete.next=delete.next.next;
        size--;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        return temp; 
    
    }
    public Node find(int data){
        Node temp=head;
        while (temp!=null) {
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;

    } 

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+ " -> ");
            temp=temp.next;

        }
        System.out.print("END   ");

    }
    public void displayReverse(){
        //with tail
        // Node temp=tail;
        // while (temp!=null) {
        //     System.out.print(temp.data+ " -> ");
        //     temp=temp.prev;

        // }
        // System.out.print("END");
       Node temp=head;
       Node last=null;
        while (temp!=null) {
            //System.out.print(temp.data+ " -> ");
            last=temp;
            temp=temp.next;

        }
        while (last!= null) {
            System.out.print(last.data+" ->");
            last=last.prev;

        }
        System.out.print("START");
    }
    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
        }
        // public Node(int data,Node next){
        //     this.data=data;
        //     this.next=next;
        // }
        // Node (int data,Node next,Node prev){
        //     this.data=data;
        //     this.prev=prev;
        //     this.next=next;
        // }
    }
}
