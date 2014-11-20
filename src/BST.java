import java.util.*;

public class BST {

  public static class Node {
    public Node a = null;
    public Node b = null;
    public int value;

    public Node(int value) {
      this.value = value;
    }

    public void insert(int value) {
      Node n = this;
      while (n.value != value) {
        if (value < n.value) {
          if (n.a != null) {
            n = n.a;
            continue;
          }
          n.a = new Node(value);
          return;
        } else if (value > n.value) {
          if (n.b != null) {
            n = n.b;
            continue;
          }
          n.b = new Node(value);
          return;
        }
      }
    }

    public void remove(int value) {
    }

    public void printDFS() {
      printDFS("");
    }

    public void printDFS(String pad) {
      System.out.println(pad + value);
      if (a != null) {
        a.printDFS(pad + " ");
      }
      if (b != null) {
        b.printDFS(pad + " ");
      }
    }

  }

  public static void main(String[] args) {
    Node n = new Node(5);
    n.insert(4);
    n.insert(2);
    n.insert(3);
    n.insert(1);
    n.insert(10);
    n.insert(15);
    n.insert(11);
    n.insert(16);
    n.printDFS();
  }


}
