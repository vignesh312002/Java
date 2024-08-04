package Java.LinkedList;

public class Main {
     public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(5);
        list.InsertLast(76);
         list.insert(25, 3);
       // System.out.println(list.deleteFirst());
       //  System.out.println(list.deleteLast());
        // System.out.println(list.deleteMiddle(1));
        // System.out.println(list.search(25));
        list.display();
        list.insertionrec(64, 3);
        list.display();


        
    //    // System.out.println(list.size());
   //  DLL list=new DLL();
   //     list.addFirst(6);
   //     list.addFirst(1);
   //     list.addFirst(5);
   //      list.addLast(83);
   //      list.addLast(99);
   //      list.addMiddle(5,25);
   //     // list.delfirst();
   //     list.dellast();
   //     list.delmiddle(3);
   //          list.display();
       
   //     //list.displayReverse();
   // CLL list =new CLL();
   // list.insert(83);
   // list.insert(5);
   // list.insert(45);
   // list.insert(32);
   // list.display();
    }
}
