package Java.LinkedList.leetCode;


// https://leetcode.com/problems/palindrome-linked-list/description/
public class PalindromeLL {
    private ListNode head;
    private ListNode tail;
    private ListNode size;
            
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
      }
    return slow;
    }
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode prev=null;
        ListNode present =head;
        ListNode next=present.next;   // null pointer exception 
        while(present !=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
        return head;
    }
    // THE SOLUTION STARTS HERE       
        public boolean isPalindrome(ListNode head) {
           ListNode mid= middleNode(head) ; //finding the head 
           ListNode secondhead=reverseList(mid);
           
           //compare the both parts of the array
           while(head!=null && secondhead!=null){
            if(head.data==secondhead.data){
                head=head.next;
                secondhead=secondhead.next;
            }
            else{
                break;
            }

           } 
           reverseList(secondhead);
           //after completing the loopos it will come out with the values as null in both 
           if(head==null || secondhead==null){ //any one is null
            return true;
           }
           else{
            return false;
           }
        }
    //https://leetcode.com/problems/reorder-list/
        public void reorderList(ListNode head) {
        if(head==null|| head.next ==null ){
            return ;
        }
        ListNode mid=middleNode(head);
        ListNode secondhead=reverseList(mid);
        ListNode firsthead=head;

        while(firsthead !=null && secondhead != null){
            //firsthalf
            ListNode temp=firsthead.next;
            firsthead.next=secondhead;
            firsthead=temp;

            //second half
            temp=secondhead.next;
            secondhead.next=firsthead;
            secondhead=temp;
        }
        //here setting the next of tail to null 
        if(firsthead !=null){
            firsthead.next=null;
        }   

        }
        // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
        public ListNode reverseAlternateKGroup(ListNode head, int k) {
            if (k <= 1 || head == null) {
                return head;
            }
    
            // skip the first left-1 nodes
            ListNode current = head;
            ListNode prev = null;
    
            while (current != null) {
                ListNode last = prev;
                ListNode newEnd = current;
    
                // reverse between left and right
                ListNode next = current.next;
                //this for loop is for inplace reversal
                 
                for (int i = 0; current != null && i < k; i++) {
                    current.next = prev;
                    prev = current;
                    current = next;
                    if (next != null) {
                        next = next.next;
                    }
                }
    
                if (last != null) {
                    last.next = prev;
                } else {
                    head = prev;
                }
    
                newEnd.next = current;
    
                // skipping  the k node after the reversal 
                for (int i = 0; current != null && i < k; i++) {
                    prev = current;
                    current = current.next;
                }
            }
            return head;
        }
    class ListNode
            {
            private int data; 
            private ListNode next; 
                public ListNode(int data )
                {
                    this.data=data;
                }  
                 public ListNode(int data,ListNode next){
                    this.data=data;
                    this.next=next;
                 }
            
            }
            
}
