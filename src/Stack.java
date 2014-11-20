import java.util.*;

public class Stack {
  public Node head;

  public int pop() {
    if (head == null) throw new IllegalStateException("Can't pop an empty stack!");
    Node old = head;
    head = old.next;
    return old.value;
  }

  public void push(int value) {
    Node push = new Node(value);
    if (head == null) {
      head = push;
      return;
    }
    push.next = head;
    head = push;
  }

  public static class Node {
    public int value;
    public Node next = null;

    public Node(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
    System.out.print(stack.pop() + " ");
  }
}
