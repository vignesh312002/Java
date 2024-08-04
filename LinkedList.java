package Java.LinkedList;


public class LinkedList {
        private Node head;
        private Node tail;
        
        private int size;  
        
        // public LinkedList(){
        //     this.size=0;
        // }
        //INSERTION AT THE FIRST INDEX
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
        //INSERTION AT Last
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
        // INSERT MIDDLE
        public void insert(int data,int index){
          if (index==0){
            InsertFirst(data);
            return ;
          }    
          if(index==size){
            InsertLast(data);
            return ;
          }
          Node temp=head;
          // we start i from 1 because 0 is head
          for (int i = 1; i < index; i++) {
            temp=temp.next;
          }
          Node node =new Node(data, temp.next);
            temp.next=node;
            size++;
        }  
        //INSERT USING RECURSION 
        public void insertionrec(int val ,int index){
            head=insertRec(val, index, head);
        } 
        private Node insertRec(int data ,int index,Node node){
              if(index==0){
                Node temp=new Node(data,node);
                size++;
                return temp;
              }
             node.next=insertRec(data, index-1,node.next);
             return node;
        }
        //DELETE FIRST ELEMENT
        public int  deleteFirst(){
            int head_value=head.data;
            head=head.next ;
            if(head==null){
                tail=null;
            }
            size--;
            return head_value;
        }
        //DELETE LAST
        public int deleteLast(){
            int tail_value=tail.data;
            if(size<=1){
                deleteFirst();
                
            }
            Node SecondLast=get(size-2);
            tail=SecondLast;
            tail.next=null;
            size--;
            return tail_value;
        }
        public int deleteMiddle(int index){
            if(index==0){
                deleteFirst();
            }
            if(index==size-1){
                deleteLast();
            }
            Node prev=get(index-1);
            int val=prev.next.data;
            prev.next=prev.next.next;
            size--;
            return val;
        }
        public Node get(int index){
           Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp;
        }
        //searching the value 
        public Node search(int data ){
            Node temp=head;
            while (temp!=null) { 
                if(data==temp.data){
                    return temp;
                }
                temp=temp.next;
            }
            return null;

        }
        //DISPLAY THE LINKED LIST 
        public void display(){
            Node temp=head;
            // System.out.print("START ->  ");
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println(" END");
        }
        //SIZE OF LIST 
        public int size(){
            return size;
        }
        // NODE CLASS AND CONSTRUCTOR 
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
