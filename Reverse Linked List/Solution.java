public class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
//        ListNode newHead = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = next;
//        }
//        return newHead;
    }

    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode head = one;
        int i = 2;
        while (i<=5){
            one.next = new ListNode(i);
            one = one.next;
            i++;
        }
        ListNode newHead = reverseList(head);
        System.out.print(newHead.val);
        while (newHead!=null){
            try {
                System.out.print("-->"+newHead.next.val);
            }
            catch (NullPointerException e){
                System.out.print("-->NULL");
            }

            newHead = newHead.next;
        }
    }
}



