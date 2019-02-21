package logic.misc;

	class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        int i=0;
        while (current != null) {
            next = current.next;
         //   System.out.println(next.data+"\t "+i);
            current.next = prev;
           // System.out.println(prev.data);
            prev = current;
            System.out.println(prev.data);
            System.out.println(current.data);
            current = next;
            System.out.println(current.data);
            ++i;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(" \n");
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list \n");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}