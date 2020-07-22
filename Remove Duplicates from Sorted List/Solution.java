public class Solution {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            if(temp.next == null)
                break;
            if(temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode head = one;
        int i = 1;
        while (i<=5){
            if(i == 5){
                one.next = new ListNode(4);
            }
            else {
                one.next = new ListNode(i);
            }
            one = one.next;
            i++;
        }
        ListNode newHead = deleteDuplicates(head);
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
