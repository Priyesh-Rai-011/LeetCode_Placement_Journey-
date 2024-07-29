package LEETCODE_Q.Linked_List;


public class T10_DetectCycle_LinkedList {
    public static boolean hasCycle(ListNode head) {
        if (head==null || head.next==null){return false;}
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Create the first node
        ListNode head = new ListNode(1);

// Create subsequent nodes and connect them
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(3);

        System.out.println(hasCycle(head));
    }
}
