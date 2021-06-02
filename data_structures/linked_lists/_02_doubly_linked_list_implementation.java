// 10 --> 5 --> 16
// 10 <-- 5 <-- 16

import java.util.*;

class _02_doubly_linked_list_implementation{
  public static void main(String[] args){
    DoublyLinkedList myLinkedList = new DoublyLinkedList(10);
    myLinkedList.displayList();

    myLinkedList.append(5);
    myLinkedList.prepend(2);
    myLinkedList.append(16);
    myLinkedList.append(6);
    myLinkedList.prepend(9);

    System.out.println(myLinkedList.getLength());
    myLinkedList.insert(0, 99);
    myLinkedList.insert(7, 66);
    System.out.println(myLinkedList.getLength());
    myLinkedList.insert(4, 44);
    myLinkedList.insert(5, 55);

    myLinkedList.remove(5);
    myLinkedList.remove(4);
    System.out.println(myLinkedList.getLength());
    myLinkedList.remove(0);
    myLinkedList.remove(6);
    myLinkedList.remove(6);
    System.out.println(myLinkedList.getLength());
    
    myLinkedList.insert(-5, -100);  // insert anywhere before index 0 - prepend
    myLinkedList.insert(8, 100);    // insert anywhere after index 5 - append
    System.out.println(myLinkedList.getLength());
  }  
}

public class DoublyLinkedList{
  Node head;
  Node tail;
  int length;

  public DoublyLinkedList(int value){
    head = new Node(value);
    tail = head;
    length = 1;
  }

  public void append(int value){
    Node newNode = new Node(value);
    tail.next = newNode;
    newNode.previous = tail;
    tail = newNode;
    length++;
    displayList();
  }
  
  public void prepend(int value){
    Node newNode = new Node(value);
    newNode.next = head;
    head.previous = newNode;
    head = newNode;
    length++;
    displayList();
  }

  private Node traverseToIndex(int index){
    Node current = head;
    for (int i = 1; i < index; ++i){
      current = current.next;
    }
    return current;
  }

  public void insert(int index, int value){
    if (index <= 0){
      prepend(value);
    }
    else if (index >= length){
      append(value);
    }
    else{
      Node current = traverseToIndex(index);
      Node newNode = new Node(value);
      newNode.next = current.next;
      current.next.previous = newNode;
      current.next = newNode;
      newNode.previous = current;
      length++;
      displayList();
    }
  }

  public void remove(int index){
    if (index < 0 || index >= length){
      System.out.println("Index is out of the bounds");
      return;
    }
    else if (index == 0){
      head = head.next;
      head.previous = null;
      length--;
    }
    else{
      Node current = traverseToIndex(index);
      current.next = current.next.next;
      length--;
      // when removing last item, it becomes tail
      if (index == length){
        tail = current;
      }
      else{        
        current.next.previous = current;
      }
    }
    displayList();
  }

  public int getLength(){
    return this.length;
  }

  public void displayList(){
    List<Integer> myList = new ArrayList<>();
    Node current = head;
    while(current != null){
      myList.add(current.value);
      current = current.next;
    }
    System.out.println("Head " + head.value + "\tTail " + tail.value + "\tList " + Arrays.toString(myList.toArray()));
    displayReverseList();
  }

  public void displayReverseList(){
    List<Integer> myList = new ArrayList<>();
    Node current = tail;
    while (current != null){
      myList.add(current.value);
      current = current.previous;
    }
    System.out.println("Head " + head.value + "\tTail " + tail.value + "\tReverse List " + Arrays.toString(myList.toArray()) + "\n");
  }
}

public class Node{
  int value;
  Node next;
  Node previous;

  public Node (int value){
    this.value = value;
    this.next = null;
    this.previous = null;
  }
}