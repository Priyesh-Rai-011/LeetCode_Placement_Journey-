package LEETCODE_Q.Linked_List;

class ListNode { int val;ListNode next;ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class T2_RemoveNth_fromLast {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0,head);
        ListNode fast = dummyHead, slow = dummyHead;
        for (int i=0; i<=n; i++){
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {

        System.out.println("HEllo World");
//        removeNthFromEnd(nums,4);
    }
}
/*
*
*
*/