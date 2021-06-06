
// https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.*;

class _02_queue_implmentation_stacks {
  public static void main(String[] args) {
    Queue myQueue = new Queue();
    System.out.println(myQueue.getLength());
    System.out.println("Is empty? " + myQueue.empty());
    System.out.println("Pop " + myQueue.pop());
    System.out.println("Peek " + myQueue.peek());
    myQueue.push(1);
    System.out.println("Peek " + myQueue.peek());
    System.out.println("Pop " + myQueue.pop());
    System.out.println("Peek " + myQueue.peek());
    myQueue.push(1);
    myQueue.push(2);
    System.out.println("Peek " + myQueue.peek());
    System.out.println("Last element " + myQueue.getLastElement());
    myQueue.push(3);
    System.out.println(myQueue.getLength());
    System.out.println("Is empty? " + myQueue.empty());
    System.out.println("Last element " + myQueue.getLastElement());
    System.out.println("Pop " + myQueue.pop());
    System.out.println("Peek " + myQueue.peek());
    System.out.println("Pop " + myQueue.pop());
    System.out.println("Peek " + myQueue.peek());
    System.out.println("Pop " + myQueue.pop());
    System.out.println(myQueue.getLength());
    System.out.println("Is empty? " + myQueue.empty());
    System.out.println("Last element " + myQueue.getLastElement());
  }
}

public class Queue {
  Stack<Integer> queueStack;
  Stack<Integer> revStack;

  public Queue() {
    this.queueStack = new Stack<>();
    this.revStack = new Stack<>();
  }

  // Pushes element x to the back of the queue
  public void push(int x) {
    if (queueStack.size() == 0) {
      queueStack.push(x);
    } else {
      while (queueStack.size() != 0) {
        revStack.push(queueStack.pop());
      }
      queueStack.push(x);
      while (revStack.size() != 0) {
        queueStack.push(revStack.pop());
      }
    }
    displayQueue();
  }

  // Removes the element from the front of the queue and returns it
  public Integer pop() {
    Integer element = null;
    if (queueStack.size() > 0) {
      element = queueStack.peek();
      if (queueStack.size() == 1) {
        System.out.print("Removed last item - ");
      }
      queueStack.pop();
    }
    if (queueStack.size() > 0) {
      displayQueue();
    } else {
      System.out.println("Queue is empty");
    }
    return element;
  }

  // Returns the element at the front of the queue
  public Integer peek() {
    if (queueStack.size() > 0) {
      return queueStack.peek();
    } else {
      return null;
    }
  }

  // Returns true if the queue is empty, false otherwise
  public boolean empty() {
    return queueStack.size() == 0;
  }

  public Integer getLastElement() {
    if (queueStack.size() > 0) {
      return queueStack.firstElement();
    } else {
      return null;
    }
  }

  public int getLength() {
    return this.queueStack.size();
  }

  public void displayQueue() {
    Stack<Integer> tempStack = new Stack<>();
    while (queueStack.size() > 0) {
      tempStack.push(queueStack.peek());
      System.out.print(tempStack.peek() + " ");
      queueStack.pop();
    }
    System.out.println();
    while (tempStack.size() > 0) {
      queueStack.push(tempStack.peek());
      tempStack.pop();
    }
  }
}