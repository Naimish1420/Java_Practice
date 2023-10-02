public class LL4 {

    public class ListNode{

        public LL4.ListNode next;

    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        if (n == size) {
            return head.next;
        }

        prev.next = prev.next.next;
        return head;
    }
    


}
