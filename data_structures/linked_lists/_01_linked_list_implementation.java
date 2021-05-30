// 10 --> 5 --> 16

// Create the below linked list:
// myLinkedList = {
//   head: {
//     value: 10
//     next: {
//       value: 5
//       next: {
//         value: 16
//         next: null
//       }
//     }
//   }
// };

import java.util.*;

class _01_linked_list_implementation{
  public static void main(String[] args){
    LinkedList myLinkedList = new LinkedList(10);
    System.out.println(myLinkedList.display());
  }  
}

public class LinkedList{
  List<Node> nodes;
  int length;

  public LinkedList(int value){
    if (length == 0){
      nodes = new ArrayList<Node>();
    }
    Node node = new Node (value, null);
    nodes.add(node);
  }

  public String display(){
    // display each node information like 10 --> 5 --> 16 --> null
    String info = "";

    for (Node node : this.nodes){
      info += node.value + " --> ";
    }

    return info;
  }
}

public class Node{
  int value;
  Integer next;

  public Node (int value, Integer next){
    this.value = value;
    this.next = next;
  }
}