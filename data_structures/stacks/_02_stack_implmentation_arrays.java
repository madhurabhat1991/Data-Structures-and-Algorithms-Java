import java.util.*;

class _02_stack_implmentation_arrays {
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
  List<String> stackArray;

  public Stack() {
    this.stackArray = new ArrayList<>();
  }

  public void push(String value) {
    stackArray.add(value);
    displayStack();
  }

  public void pop() {
    if (this.stackArray.size() > 0) {
      this.stackArray.remove(this.stackArray.size() - 1);
    }

    if (this.stackArray.size() > 0) {
      displayStack();
    } else {
      System.out.println("Stack is empty");
    }
  }

  public String peek() {
    if (this.stackArray.size() > 0) {
      return this.stackArray.get(this.stackArray.size() - 1);
    } else {
      return null;
    }
  }

  public boolean isEmpty() {
    return this.stackArray.size() == 0;
  }

  public String getLastElement() {
    if (this.stackArray.size() > 0) {
      return this.stackArray.get(0);
    } else {
      return null;
    }
  }

  public int getLength() {
    return this.stackArray.size();
  }

  public void displayStack() {
    List<String> reverseList = new ArrayList<>();
    reverseList.addAll(this.stackArray);
    Collections.reverse(reverseList);
    System.out.println("Top " + this.stackArray.get(this.stackArray.size() - 1) + "\tBottom " + this.stackArray.get(0)
        + "\tList " + Arrays.toString(reverseList.toArray()));
  }
}