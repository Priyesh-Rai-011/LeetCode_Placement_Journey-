package LEETCODE_Q.Linked_List;

public class T11_DetectCycle_ReturnTarget {
    public static ListNode detectCycle_returnTarget(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode target = head;

                while (target != slow) {
                    target = target.next;
                    slow = slow.next;
                }
                return target;
            }
        }
        return null;
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
 

        System.out.println(detectCycle_returnTarget(head));
    }
}
