import java.util.*;

class _02_priority_queue{
  public static void main(String[] args){
    PriorityQueue queue = new PriorityQueue();
    queue.dequeue();
    queue.enqueue("jack", 3);
    queue.enqueue("john", 2);
    queue.enqueue("jane", 4);
    queue.enqueue("jimmy", 1);
    System.out.println("Front " + queue.front().value);    
    System.out.println("Empty? " + queue.isEmpty());
    queue.dequeue();
    queue.dequeue();
    System.out.println("Front " + queue.front().value);
    queue.dequeue();
    System.out.println("Rear " + queue.rear().value);
    queue.dequeue();
    queue.dequeue();
    System.out.println("Empty? " + queue.isEmpty());

  }
}

public class PriorityQueue {
  List<Node> queue;

  public PriorityQueue(){
    this.queue = new ArrayList<Node>();
  }

  public void enqueue(String value, int priority){
    Node newNode = new Node(value, priority);
    boolean contain = false;
    for (int i = 0; i < queue.size(); i++){
      if (queue.get(i).priority > priority){
        queue.add(i, newNode);
        contain = true;
        break;
      }
    }
    if (!contain){
      queue.add(newNode);
    }
    displayQueue();
  }

  public void dequeue(){
    if (queue.size() > 0){
      queue.remove(0);
      if (queue.size() > 0){
        displayQueue();
      }
      else{
        System.out.println("Priority Queue became empty");
      }
    }
    else{
      System.out.println("Priority Queue is empty");
    }
  }

  public Node front(){
    if (!queue.isEmpty()){
      return queue.get(0);
    }
    return null;
  }

  public Node rear(){
    if (!queue.isEmpty()){
      return queue.get(queue.size()-1);
    }
    return null;
  }

  public boolean isEmpty(){
    return queue.isEmpty();
  }

  public void displayQueue(){
    List<String> myList = new ArrayList<String>();
    for (Node each : queue){
      myList.add(each.value);
    }
    System.out.println(Arrays.toString(myList.toArray()));
  }
}

public class Node {
  String value;
  int priority;

  public Node (String value, int priority){
    this.value = value;
    this.priority = priority;
  }
}