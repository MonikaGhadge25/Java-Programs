/*
delete the node at the tail of a linked list 
*/
public class NodeAtTailOfLinkedListDelete
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void InsertAtTail(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Delete the node at the tail
        void deleteAtTail() {
            if (head == null) {
                // List is empty
                return;
            }
            if (head == tail) {
                // Only one node
                head = null;
                tail = null;
                return;
            }
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.InsertAtTail(5);
        ll.InsertAtTail(6);
        ll.InsertAtTail(7);
        ll.InsertAtTail(8);
        ll.InsertAtTail(9);
        ll.InsertAtTail(10);
        System.out.print("Original list: ");
        ll.display();

        ll.deleteAtTail();
        System.out.print("After deleting tail: ");
        ll.display();

        ll.deleteAtTail();
        System.out.print("After deleting tail again: ");
        ll.display();
    }
}