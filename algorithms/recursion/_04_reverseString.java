//Implement a function that reverses a string using iteration...and then recursion!
// reverseString("hey madhura")
// should return: "aruhdam yeh"

import java.util.*;

class _04_reverseString {
  public static void main(String[] args) {
    String str = "hey madhura";
    System.out.println(reverseStringRecursive(str));
    System.out.println(reverseStringIterative(str));
  }

  public static String reverseStringRecursive(String str) {
    if (str.equals("")) {
      return "";
    }
    return reverseStringRecursive(str.substring(1)) + str.charAt(0);

    // TC - O(n)
  }

  public static String reverseStringIterative(String str) {
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    return reverse;

    // TC - O(n)
  }
}