package LeetCode.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        if(head == null){
            return null;
        }
        newHead = head;
        if(head.next != null){
            newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;            
        }
        return newHead;
    }
}
