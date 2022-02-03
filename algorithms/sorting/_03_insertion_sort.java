import java.util.*;

class _03_insertion_sort {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
    insertionSort(numbers);
    numbers = new ArrayList<Integer>(Arrays.asList(0, 99, 8, 99));
    insertionSort(numbers);
  }

  public static void insertionSort(List<Integer> numbers) {
    int length = numbers.size();
    for (int i = 0; i < length; i++) {
      // if number is less than 1st number, move it at start of the list
      if (numbers.get(i) <= numbers.get(0)) {
        numbers.add(0, numbers.remove(i));
      } else {
        // check where should the number be placed and move it
        // only sort number smaller than number on the left of it
        if (numbers.get(i) < numbers.get(i - 1)) {
          // find where number should go
          for (int j = 0; j < i; j++) {
            if (numbers.get(i) < numbers.get(j)){
              numbers.add(j, numbers.remove(i));
              // end inner loop after element moved.
              break;
            }
          }
        }
      }
    }
    System.out.println(numbers);

    // TC - Best - O(n), Worst - O(n^2)
    // SC - O(1)
  }
}