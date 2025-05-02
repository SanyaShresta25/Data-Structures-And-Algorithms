package FastAndSlow;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // moves 1 step
            fast = fast.next.next;     // moves 2 steps
        }

        return slow; // slow is at the middle
    }

    public static void main(String[] args) {
        // Create a linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode middle = solution.middleNode(head);

        System.out.println("Middle node value: " + middle.val); // Output: 3
    }
}
