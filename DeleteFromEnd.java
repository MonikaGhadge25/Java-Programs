public class DeleteFromEnd {
    // Node class for singly linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to delete the nth node from the end of the list
    public static Node deleteFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy, second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (first == null) return head; // n is larger than list length
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Delete the nth node from end
        if (second.next != null) {
            second.next = second.next.next;
        }

        return dummy.next;
    }

    // Helper function to print the list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original list: ");
        printList(head);

        int n = 2;
        System.out.println("Deleting " + n + "th node from end of the list.");
        head = deleteFromEnd(head, n);

        System.out.print("After deleting " + n + "th node from end: ");
        printList(head);
    }
}