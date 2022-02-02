import java.util.*;

class _01_bubble_sort {
  public static void main(String[] args) {
    int[] numbers = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
    bubbleSort(numbers);
    numbers = new int[] { 0, 99, 8, 99 };
    bubbleSort(numbers);
  }

  public static void bubbleSort(int[] numbers) {
    int length = numbers.length;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          // swap numbers
          var temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(numbers));

    // TC - O(n^2)
    // SC - O(1)
  }
}