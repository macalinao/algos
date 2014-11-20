import java.util.*;

class CircularLinkedList {

  public static class Node {
    public Node next = null;
    public int value;

    public Node(int value) {
      this.value = value;
    }

  }

  public static void main(String[] args) {
    Node n = new Node(1);
    n.next = new Node(2);
    n.next.next = new Node(3);
    n.next.next.next = new Node(4);
    n.next.next.next.next = n.next.next;

    // Circular starts at index 2
    
    Node a = n.next;
    Node b = n.next.next;
    while (!a.equals(b)) {
      a = a.next;
      b = b.next.next;
    }

    a = n;
    int pt = 0;
    while (!a.equals(b)) {
      a = a.next;
      pt++;
    }
    System.out.println(pt);
  }

}
