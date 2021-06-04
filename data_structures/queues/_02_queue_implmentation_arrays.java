import java.util.*;

class _02_queue_implmentation_arrays {
  public static void main(String[] args) {
    Queue myQueue = new Queue();
    System.out.println(myQueue.getLength());
    System.out.println("Is empty? " + myQueue.isEmpty());
    myQueue.dequeue();
    System.out.println("Peek " + myQueue.peek());
    myQueue.enqueue("Scooby");
    System.out.println("Peek " + myQueue.peek());
    myQueue.dequeue();
    System.out.println("Peek " + myQueue.peek());
    myQueue.enqueue("Scooby");
    myQueue.enqueue("Shaggy");
    System.out.println("Peek " + myQueue.peek());
    myQueue.enqueue("Velma");
    System.out.println(myQueue.getLength());
    System.out.println("Is empty? " + myQueue.isEmpty());
    System.out.println("Last element " + myQueue.getLastElement());
    myQueue.dequeue();
    System.out.println("Peek " + myQueue.peek());
    myQueue.dequeue();
    System.out.println("Peek " + myQueue.peek());
    myQueue.dequeue();
    System.out.println(myQueue.getLength());
    System.out.println("Is empty? " + myQueue.isEmpty());
    System.out.println("Last element " + myQueue.getLastElement());
  }
}

public class Queue {
  Node first;
  Node last;
  int length;

  public Queue() {
    this.first = null;
    this.last = null;
    this.length = 0;
  }

  public void enqueue(String value) {
    Node newNode = new Node(value);
    if (length == 0) {
      first = newNode;
    } else {
      last.next = newNode;
    }
    last = newNode;
    length++;
    displayQueue();
  }

  public void dequeue() {
    if (length > 0) {
      first = first.next;
      if (length == 1) {
        last = null;
        System.out.print("Removed last item - ");
      }
      length--;
    }
    if (length > 0) {
      displayQueue();
    } else {
      System.out.println("Queue is empty");
    }
  }

  public String peek() {
    if (length > 0) {
      return first.value;
    } else {
      return null;
    }
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public String getLastElement() {
    if (length > 0) {
      return last.value;
    } else {
      return null;
    }
  }

  public int getLength() {
    return this.length;
  }

  public void displayQueue() {
    List<String> myList = new ArrayList<>();
    Node current = this.first;
    while (current != null) {
      myList.add(current.value);
      current = current.next;
    }
    System.out.println(
        "First " + this.first.value + "\tLast " + this.last.value + "\tList " + Arrays.toString(myList.toArray()));
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