import java.util.*;

class _05_array_implementation {
  public static void main(String[] args) {
    MyArray newArray = new MyArray();
    newArray.displayArrayInfo();

    newArray.push("Hi");
    newArray.push("You");
    newArray.push("Hola!");
    newArray.push("1");
    newArray.push("2");
    newArray.push("3");
    newArray.push("4");
    newArray.push("5");
    newArray.push("6");

    System.out.println("Index0 " + newArray.get(0));
    System.out.println("Index2 " + newArray.get(2));
    System.out.println("Index4 " + newArray.get(4));
    System.out.println();

    // newArray.push("delete!");
    newArray.pop();
    newArray.pop();
    newArray.pop();
    newArray.pop();

    newArray.deleteAtIndex(1);
    // newArray.deleteAtIndex(2);
    // newArray.deleteAtIndex(4);

    newArray.addAtIndex(1, "Add!!");
    newArray.addAtIndex(2, "New!!");
  }
}

public class MyArray {
  int length; // current length
  String[] data; // data storage

  // initialize the array
  public MyArray() {
    this.length = 0;
    this.data = new String[1];
  }

  // display array information
  public void displayArrayInfo() {
    System.out.println("Current length: " + this.length + "\nArray: " + Arrays.toString(this.data) + "\n");
  }

  // return the item in the given index
  public String get(int index) {
    if (index < 0 || index >= length) {
      return ("Error: Index is out of the bounds");
    }
    return this.data[index];
  }

  // change the size of array and copy original items
  private void copyArray(int newLength) {
    String[] tempArray = new String[this.length];
    tempArray = Arrays.copyOf(this.data, this.length);
    this.data = Arrays.copyOf(tempArray, newLength);
  }

  // add the item to the end of the array and increment the length
  public void push(String item) {
    if (this.length == this.data.length) {
      copyArray(this.length * 2);
    }
    this.data[this.length] = item;
    this.length++;
    displayArrayInfo();
  }

  // remove the item from the end of the array and decrement the length
  public void pop() {
    if (this.data == null || this.length <= 0) {
      System.out.println("Error: Array is empty or uninitialized");
      return;
    }
    this.data[this.length - 1] = null;
    copyArray(this.length - 1);
    this.length--;
    displayArrayInfo();
  }

  // shift items in the array one place to the left
  private void shiftItemsToLeft(int index) {
    for (int i = index; i < this.length - 1; ++i) {
      this.data[i] = this.data[i + 1];
    }
    this.data[this.length - 1] = null;
  }

  // shift items in the array one place to the right
  private void shiftItemsToRight(int index) {
    for (int i = this.length - 1; i >= index; --i) {
      this.data[i + 1] = this.data[i];
    }
    this.data[index] = null;
  }

  // delete the item at the index in the array
  public void deleteAtIndex(int index) {
    if (index < 0 || index >= length) {
      System.out.println("Error: Index is out of the bounds");
      return;
    }
    shiftItemsToLeft(index);
    copyArray(this.length - 1);
    this.length--;
    displayArrayInfo();
  }

  // add the item at the index in the array
  public void addAtIndex(int index, String item) {
    if (index < 0 || index >= length) {
      System.out.println("Error: Index is out of the bounds");
      return;
    }
    copyArray(this.length + 1);
    shiftItemsToRight(index);
    this.data[index] = item;
    this.length++;
    displayArrayInfo();
  }
}