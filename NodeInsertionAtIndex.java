
    /* Write a program to insert at any position in a linked list node */
class NodeInsertionAtIndex {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at a specific position (0-based index)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeInsertionAtIndex list = new NodeInsertionAtIndex();

        // Inserting nodes at specific positions
        list.insertAtPosition(10, 0); // 10
        list.insertAtPosition(20, 1); // 10 20
        list.insertAtPosition(30, 1); // 10 30 20
        list.insertAtPosition(40, 2); // 10 30 40 20
        list.insertAtPosition(50, 4); // 10 30 40 20 50

        // Printing the linked list
        System.out.println("Linked List:");
        list.printList();
    }
}