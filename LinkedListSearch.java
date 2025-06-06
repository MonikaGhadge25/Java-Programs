/*
write a program to find the TARGET index in the linked list, using Node class.
*/
class LinkedListSearch {
    // Node class definition
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Constructor with correct name
    LinkedListSearch() {
        head = null;
    }

    // Method to insert values into the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to find the index of a target value
    public int findTargetIndex(int target) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        LinkedListSearch list = new LinkedListSearch();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        int target = 30;
        int index = list.findTargetIndex(target);
        
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the linked list.");
        }
    }
}