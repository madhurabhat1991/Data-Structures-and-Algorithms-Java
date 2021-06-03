
// given two sorted arrays merge it into a sorted array
// inputs - [0,3,4,31], [4,6,30]
// output - [0,3,4,4,6,30,31]

import java.util.*;

class _07_mergeSortedArrays {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(mergeSortedArrays(new int[0], new int[0])));
    System.out.println(Arrays.toString(mergeSortedArrays(new int[0], new int[] { 1, 2 })));
    System.out.println(Arrays.toString(mergeSortedArrays(new int[] { 1, 2, 3 }, new int[0])));
    System.out.println(Arrays.toString(mergeSortedArrays(new int[] { 1, 5, 6 }, new int[] { 1, 2 })));
    System.out.println(Arrays.toString(mergeSortedArrays(new int[] { 1 }, new int[] { 3, 6 })));
    System.out.println(Arrays.toString(mergeSortedArrays(new int[] { 1, 4 }, new int[] { 3 })));

  }

  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    if (arr1.length == 0) {
      return arr2;
    }
    if (arr2.length == 0) {
      return arr1;
    }

    int i = 0; // arr1 index
    int j = 0; // arr2 index
    int[] mergedArray = new int[arr1.length + arr2.length];
    int k = 0; // mergedArray index

    // merging the elements with common indices
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        mergedArray[k] = arr1[i];
        i++;
      } else {
        mergedArray[k] = arr2[j];
        j++;
      }
      k++;
    }

    // merging the extra elements
    while (i < arr1.length) {
      mergedArray[k] = arr1[i];
      i++;
      k++;
    }
    while (j < arr2.length) {
      mergedArray[k] = arr2[j];
      j++;
      k++;
    }

    return mergedArray;

  }
}