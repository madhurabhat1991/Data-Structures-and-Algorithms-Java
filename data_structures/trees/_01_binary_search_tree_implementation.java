//       9
//   4       20
// 1   6  15    170

import java.util.*;

class _01_binary_search_tree_implementation{
  public static void main(String[] args){
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(9);
    tree.insert(4);
    tree.insert(20);
    tree.insert(1);
    tree.insert(6);
    tree.insert(15);
    tree.insert(170);
  }
}

public class BinarySearchTree{
  Node root;

  public BinarySearchTree (){
    this.root = null;
  }

  public void insert(int value){
    Node newNode = new Node(value);
    if (root == null){
      root = newNode;
    }
    else{
      Node current = root;
      while(true){
        // right
        if (value >= current.value){  // what happens when equal?
          if (current.right != null){
            current = current.right;
          }
          else{
            current.right = newNode;
            break;
          }
        }
        // left
        else {
          if (current.left != null){
            current = current.left;
          }
          else{
            current.left = newNode;
            break;
          }
        }
      }
    }
    displayTree(this.root);
  }

  public boolean lookup (int value){
    return false;
  }

  public void displayTree(Node node){
    HelperFunctions hf = new HelperFunctions();
    ArrayList<Integer> myTree = hf.traverseInOrder(node, new ArrayList<Integer>());
    System.out.println(
        "Root " + this.root.value + "\tTree " + Arrays.toString(myTree.toArray()));
  }

}

public class Node{
  Node left;
  Node right;
  int value;

  public Node (int value){
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

public class HelperFunctions{
  // traverse in order
  public ArrayList<Integer> traverseInOrder(Node node, ArrayList<Integer> array){
    if (node.left != null){
      traverseInOrder(node.left, array);
    }
    array.add(node.value);
    if (node.right != null){
      traverseInOrder(node.right, array);
    }
    return array;
  }
}