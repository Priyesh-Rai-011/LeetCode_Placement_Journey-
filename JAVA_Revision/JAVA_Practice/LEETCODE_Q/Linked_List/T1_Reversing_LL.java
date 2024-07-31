package LEETCODE_Q.Linked_List;
public class T1_Reversing_LL {
        public static ListNode reverseLL(ListNode head) {
            ListNode dHead = null;
            while(head != null){
                ListNode temp = head.next;
                head.next=dHead;
                dHead=head;
                head=temp;
            }
            return dHead;
        }
    public static void main(String[] args) {
        // Create the first node
        ListNode head = new ListNode(7);
        // Create subsequent nodes and connect them
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(4);
        PrintLL.printList(head);
        reverseLL(head);
        PrintLL.printList(head);
    }
}
