package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedListBetween2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null || left == right) return head;
    ListNode dummy = new ListNode(0), prev = dummy;
    dummy.next = head;

    for (int i = 1; i < left; i++) prev = prev.next;
    ListNode curr = prev.next;
    for (int i = 0; i < right - left; i++) {
        ListNode temp = curr.next;
        curr.next = temp.next;
        temp.next = prev.next;
        prev.next = temp;
    }
    return dummy.next;
    }

    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int left = 2, right = 4;

        ReverseLinkedListBetween2 solution = new ReverseLinkedListBetween2();
        ListNode result = solution.reverseBetween(head, left, right);

        // Print result: should be 1 → 4 → 3 → 2 → 5
        System.out.print("List after reversing between positions " + left + " and " + right + ": ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
