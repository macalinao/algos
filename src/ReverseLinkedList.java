import java.util.*;

class ReverseLinkedList {

  public static class Node {
    public Node next = null;
    public int value;

    public Node(int value) {
      this.value = value;
    }

    public void print() {
      Node n = this;
      while (n != null) {
        System.out.print(n.value + " ");
        n = n.next;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Node n = new Node(1);
    n.next = new Node(2);
    n.next.next = new Node(3);
    n.next.next.next = new Node(4);
    n.next.next.next.next = new Node(5);

    n.print();

    // Reverse linked list
    Node prev = null;
    Node current = n;
    Node next;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    prev.print();
  }

}
