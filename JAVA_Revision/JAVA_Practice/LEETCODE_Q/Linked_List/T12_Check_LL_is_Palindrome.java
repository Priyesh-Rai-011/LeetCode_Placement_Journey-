package LEETCODE_Q.Linked_List;

public class T12_Check_LL_is_Palindrome {
    public static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null){
            slow=slow.next;
        }

        slow = reverseLL(slow);

        while (slow!=null){
            if (head.val != slow.val){
                return false;
            }
            slow=slow.next;
            head=head.next;
        }
        return true;
    }
    private static ListNode reverseLL(ListNode head){
        ListNode dummyHead=null;
        while (head!=null){
            ListNode temp = head.next;
            head.next=dummyHead;
            dummyHead=head;
            head=temp;
        }
        return head;
    }
    public static void main(String[] args) {
        // Create the first node
        ListNode head = new ListNode(7);
        // Create subsequent nodes and connect them
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(7);

        System.out.println(isPalindrome(head));

        // Create the first node
        ListNode head2 = new ListNode(7);
        // Create subsequent nodes and connect them
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(5);
        head2.next.next.next = new ListNode(1);
        head2.next.next.next.next = new ListNode(7);

        System.out.println(isPalindrome(head2));
    }
}
