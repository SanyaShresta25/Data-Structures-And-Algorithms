
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
}

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head; // Make it circular
        k = k % length;
        k = length - k;

        while (k-- > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        // Manually building the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        RotateList solution = new RotateList();
        ListNode rotated = solution.rotateRight(head, k);

        // Print result
        while (rotated != null) {
            System.out.print(rotated.val + " ");
            rotated = rotated.next;
        }
    }
}
