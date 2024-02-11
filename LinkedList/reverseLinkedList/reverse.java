package LinkedList.reverseLinkedList;

class Node {
    int data;
    Node next;
    
    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  
    public Node() {
      this.data = 0;
      this.next = null;
    }
}

class Solution {
    public static Node reverseLinkedList(Node head) {
      Node curr = head;
      Node after = null;
      Node before = null;
      
      while (curr != null) {
        after = curr.next;
        curr.next = before;
        before = curr;
        curr = after;
      }
      
      return before; 
    }
}

public class reverse {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list
        head = Solution.reverseLinkedList(head); // Fix: Use 'Solution' instead of 'reverse'

        System.out.println("\nReversed Linked List:");
        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
