package FastAndSlow;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true; // cycle detected
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {
        // Create a linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create a cycle: -4 -> 2
        head.next.next.next.next = head.next;

        LinkedListCycle solution = new LinkedListCycle();
        boolean result = solution.hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + result); // Output: true
    }
}
