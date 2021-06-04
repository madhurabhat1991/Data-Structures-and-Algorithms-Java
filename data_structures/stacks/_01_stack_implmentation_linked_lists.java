import java.util.*;

class _01_stack_implmentation_linked_lists {
  public static void main(String[] args) {
    Stack myStack = new Stack();
    System.out.println(myStack.getLength());
    System.out.println("Is empty? " + myStack.isEmpty());
    myStack.pop();
    System.out.println("Peek " + myStack.peek());
    myStack.push("Google");
    System.out.println("Peek " + myStack.peek());
    myStack.pop();
    System.out.println("Peek " + myStack.peek());
    myStack.push("Google");
    myStack.push("Udemy");
    System.out.println("Peek " + myStack.peek());
    myStack.push("Discord");
    System.out.println(myStack.getLength());
    System.out.println("Is empty? " + myStack.isEmpty());
    System.out.println("Last element " + myStack.getLastElement());
    myStack.pop();
    myStack.pop();
    myStack.pop();
    System.out.println(myStack.getLength());
    System.out.println("Is empty? " + myStack.isEmpty());
    System.out.println("Last element " + myStack.getLastElement());
  }
}

public class Stack {
  Node top;
  Node bottom;
  int length;

  public Stack() {
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }

  public void push(String value) {
    Node newNode = new Node(value);
    if (length == 0) {
      top = newNode;
      bottom = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    length++;
    displayStack();
  }

  public void pop() {
    if (length > 0) {
      top = top.next;
      if (length == 1) {
        bottom = null;
        System.out.print("Removed last item - ");
      }
      length--;
    }
    if (length > 0) {
      displayStack();
    } else {
      System.out.println("Stack is empty");
    }
  }

  public String peek() {
    if (length > 0) {
      return top.value;
    } else {
      return null;
    }
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public String getLastElement() {
    if (length > 0) {
      return bottom.value;
    } else {
      return null;
    }
  }

  public int getLength() {
    return this.length;
  }

  public void displayStack() {
    List<String> myList = new ArrayList<>();
    Node current = this.top;
    while (current != null) {
      myList.add(current.value);
      current = current.next;
    }
    System.out.println(
        "Top " + this.top.value + "\tBottom " + this.bottom.value + "\tList " + Arrays.toString(myList.toArray()));
  }
}

public class Node {
  String value;
  Node next;

  public Node(String value) {
    this.value = value;
    this.next = null;
  }
}