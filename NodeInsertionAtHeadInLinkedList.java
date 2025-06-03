public class NodeInsertionAtHeadInLinkedList
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linkedlist{
        Node head= null;
        // Node tail=null;
        void InsertAtHead(int val){
                Node newNode= new Node(val);
                newNode.next = head; 
                head = newNode;
        }
        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.InsertAtHead(5);
        ll.display();
        ll.InsertAtHead(6);
        ll.display();
        ll.InsertAtHead(7);
        ll.display();
        ll.InsertAtHead(8);
        ll.display();
        ll.InsertAtHead(9);
        ll.display();
    }
}