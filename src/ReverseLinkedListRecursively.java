import java.util.*;

class ReverseLinkedListRecursively {

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

    Node reversed = reverse(n);

    reversed.print();
  }

  public static Node reverse(Node list) {
    if (list == null) return null;
    if (list.next == null) return list;

    Node res = reverse(list.next);
    list.next.next = list;
    list.next = null;
    return res;
  }

}
