public class NodeInsertionAtIndex
{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node insertAtIndex(Node head, int index, int data) {
        Node newNode = new Node(data);
        
        if (index == 0) {
            newNode.next = head;
            return newNode; // New head
        }

        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return head; // Index is out of bounds
        }

        newNode.next = current.next;
        current.next = newNode;

        return head; // Return the original head
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtIndex(head, 0, 5); // Insert at head
        display(head);
        head = insertAtIndex(head, 1, 6); // Insert at tail
        display(head);
        head = insertAtIndex(head, 1, 7); // Insert at index 1
        display(head);
        head = insertAtIndex(head, 2, 8); // Insert at index 2
        display(head);
        head = insertAtIndex(head, 0, 9); // Insert at index 0
        display(head);
    }
}