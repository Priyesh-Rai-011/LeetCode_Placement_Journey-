package LEETCODE_Q.Linked_List;

public class PrintLL {
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
        // Mark the end of the list
    }
}
