// Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.

// 2 parameters - arrays - no size limit
// return true or false

import java.util.*;

class _01_containsCommonItem {
  public static void main(String[] args) {
    char[] arr1 = new char[] { 'a', 'b', 1, 'c', 'd', 'd' };
    char[] arr2 = new char[] { 'z', 'y', 1, 'x' };

    boolean result = containsCommonItemNaive(arr1, arr2);
    System.out.println(result);

    result = containsCommonItem(arr1, arr2);
    System.out.println(result);
  }

  public static boolean containsCommonItemNaive(char[] arr1, char[] arr2) {
    for (int i = 0; i < arr1.length; ++i) {
      for (int j = 0; j < arr2.length; ++j) {
        if (arr1[i] == arr2[j]) {
          return true;
        }
      }
    }
    return false;

    // Time complexity - O(a*b)
    // Space complexity - O(1)
  }

  public static boolean containsCommonItem(char[] arr1, char[] arr2) {
    HashMap<Character, Boolean> occ = new HashMap<Character, Boolean>();

    // loop through first array and create object where properties === items in the
    // array
    for (char a : arr1) {
      if (!occ.containsKey(a)) {
        occ.put(a, true);
      }
    }

    // loop through second array and check if item in second array exists in created
    // object.
    for (char a : arr2) {
      if (occ.containsKey(a)) {
        return true;
      }
    }
    return false;

    // Time complexity - O(a + b)
    // Space complexity - O(a)
  }

}