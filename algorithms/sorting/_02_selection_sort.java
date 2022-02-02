import java.util.*;

class _02_selection_sort {
  public static void main(String[] args) {
    int[] numbers = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
    selectionSort(numbers);
    numbers = new int[] { 0, 99, 8, 99 };
    selectionSort(numbers);
  }

  public static void selectionSort(int[] numbers) {
    int length = numbers.length;
    for (int i = 0; i < length; i++) {
      int smallestIndex = i;
      for (int j = i; j < length; j++) {
        if (numbers[j] < numbers[smallestIndex]) {
          smallestIndex = j;
        }
      }
      // swap numbers
      var temp = numbers[i];
      numbers[i] = numbers[smallestIndex];
      numbers[smallestIndex] = temp;
    }
    System.out.println(Arrays.toString(numbers));

    // TC - O(n^2)
    // SC - O(1)
  }
}