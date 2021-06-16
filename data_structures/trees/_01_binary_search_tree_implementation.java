//       9
//   4       20
// 1   6  15    170

import java.util.*;

class _01_binary_search_tree_implementation {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(9);
    tree.insert(4);
    tree.insert(20);
    tree.insert(1);
    tree.insert(6);
    tree.insert(15);
    tree.insert(170);
    System.out.println(tree.lookup(6));
    System.out.println(tree.lookup(15));
    System.out.println(tree.lookup(100));
    tree.remove(20);
    tree.displayTree(tree.root);
  }
}

public class BinarySearchTree {
  Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
    } else {
      Node current = root;
      while (true) {
        // right
        if (value > current.value) { // what happens when equal?
          if (current.right != null) {
            current = current.right;
          } else {
            current.right = newNode;
            break;
          }
        }
        // left
        else {
          if (current.left != null) {
            current = current.left;
          } else {
            current.left = newNode;
            break;
          }
        }
      }
    }
    displayTree(this.root);
  }

  public boolean lookup(int value) {
    Node current = root;
    while (current != null){
      if (value == current.value){
        return true;
      }
      if (value > current.value){
        current = current.right;
      }
      else {
        current = current.left;
      }
    }
    return false;
  }

  public void remove(int value){
    if (root == null){
      return;
    }
    Node current = root;
    Node parentNode = null;
    while (current != null){
      if (value < current.value){
        parentNode = current;
        current = current.left;
      }
      else if (value > current.value){
        parentNode = current;
        current = current.right;
      }
      // (value == current.value, means if we found the value to be removed)
      else {
          // Option 1: NO RIGHT CHILD            // Child means the child of current Node
          if (current.right == null) {
              // if parentNode is null means delete the root node
              if (parentNode == null) {
                  this.root = current.left;
              } else {
                  // if current < parent, make current left child a left child of parent
                  if (current.value < parentNode.value) {
                      parentNode.left = current.left;
                  }
                  // if current > parent, make current's left child a right child of parent
                  else if (current.value > parentNode.value) {
                      parentNode.right = current.left;
                  }
              }
          }

          // Option 2: RIGHT CHILD WHICH DOESN'T HAVE A LEFT CHILD
          else if (current.right.left == null) {
              current.right.left = current.left;
              if (parentNode == null) {
                  this.root = current.right;
              } else {
                  // if current < parent, make current's right child a left child of parent
                  if (current.value < parentNode.value) {
                      parentNode.left = current.right;
                  }
                  // if current > parent, make current's right child a right child of parent
                  else if (current.value > parentNode.value) {
                      parentNode.right = current.right;
                  }
              }
          }

          // Option 3: RIGHT CHILD WHICH HAVE LEFT CHILD
          else {
              if (parentNode == null) {
                  // save reference of left and right nodes of the root
                  Node leftNode = this.root.left;
                  Node rightNode = this.root.right;
                  // root.right.left node becomes new root
                  this.root = current.right.left;
                  rightNode.left = rightNode.left.right;
                  // set back the saved reference of left and right nodes of root.
                  this.root.left = leftNode;
                  this.root.right = rightNode;
              } else {
                  if (current.value < parentNode.value) {
                      parentNode.left = current.right.left;
                  } else if (current.value > parentNode.value) {
                      parentNode.right = current.right.left;
                  }
              }
          }
          return;
      }
    }
  }

  public void displayTree(Node node) {
    HelperFunctions hf = new HelperFunctions();
    ArrayList<Integer> myTree = hf.traverseInOrder(node, new ArrayList<Integer>());
    System.out.println("Root " + this.root.value + "\tTree " + Arrays.toString(myTree.toArray()));
  }

}

public class Node {
  Node left;
  Node right;
  int value;

  public Node(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

public class HelperFunctions {
  // traverse in order
  public ArrayList<Integer> traverseInOrder(Node node, ArrayList<Integer> array) {
    if (node.left != null) {
      traverseInOrder(node.left, array);
    }
    array.add(node.value);
    if (node.right != null) {
      traverseInOrder(node.right, array);
    }
    return array;
  }
}