package LEETCODE_Q.Linked_List;

import java.util.ArrayList;
import java.util.List;

public class Q1_MaxTwinSumOf_LL {
    // 1st APPROACH
//    public static int pairSum(ListNode head){
//        int sum=0;
//        List<Integer> vals = new ArrayList<>();
//        for(;head!=null;head=head.next){
//            vals.add(head.val);
//        }
////        System.out.println(vals);
//        int n= vals.size();
//        for (int i=0; i<n>>1;i++){
////            System.out.println(i+"+"+ (vals.size()-i-1)+"="+(vals.get(i)+vals.get(n-i-1)));
//            sum=Math.max(sum,(vals.get(i)+vals.get(n-i-1)));
//        }
//        return sum;
//    }
//    2nd APPROACH
    public static int pairSum(ListNode head){
        int sum=0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tail = revLL(slow);
        while (tail!=null){
            sum=Math.max(sum,(head.val+tail.val));
//            System.out.println(head.val+tail.val);
            head=head.next;
            tail=tail.next;
        }
        return sum;
    }
    public static ListNode revLL(ListNode head){
        ListNode dummyHead = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = dummyHead;
            dummyHead=head;
            head=temp;
        }
        return dummyHead;
    }
    public static void main(String[] args) {
        // Create the first node
        ListNode head = new ListNode(7);
        // Create subsequent nodes and connect them
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(7);
        System.out.println(pairSum(head));
    }
}