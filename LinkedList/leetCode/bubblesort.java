package Java.LinkedList.leetCode;



public class bubblesort {
    private Node head;
    private Node tail;
    public int size;

    private class Node{

        private Node next;
        private int data;

        public Node(int data) {
        this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
}
public Node get(int index){
    Node temp=head;
     for(int i=0;i<index;i++){
         temp=temp.next;
     }
     return temp;
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

public void bubblesort(){
  bubblesort(size-1,0);
    
}
private void bubblesort(int row, int col) {
   if(row==0){
    return ;
   }

   if(col<row){ //col>row
    Node first=get(col);
    Node second =get(col+1);
    if(first.data>second.data){
          //swap
          if(first==head){
            head=second;
            first.next =second.next;
            second.next=first;
          }
          else if(second==tail){
             Node prev=get(col-1);
             prev.next=second;
             tail=first;
             first.next=null;
             second.next=tail;
          }
          else{
            Node prev=get(col-1);
            prev.next=first;
            first.next=second.next;
            second.next=first;
            
          }
    }
    bubblesort(row, col+1);
   }
   else{
    bubblesort(row-1, 0);
   }
}


public static void main(String[] args) {
  // bubblesort first=new bubblesort();
  // bubblesort second=new bubblesort();
  
  bubblesort list=new bubblesort();
  for (int i = 7; i >0; i++) {
    list.InsertLast(i);
  }
  
  list.bubblesort();
  list.display(); }



}
