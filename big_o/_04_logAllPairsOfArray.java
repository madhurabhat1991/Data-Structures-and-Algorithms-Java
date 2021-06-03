class _04_logAllPairsOfArray {
  public static void main(String[] args) {
    String[] boxes = new String[] { "a", "b", "c", "d", "e" };

    logAllPairsOfArray(boxes);
  }

  public static void logAllPairsOfArray(String[] boxes) {
    for (int i = 0; i < boxes.length; ++i) { // O(n)
      for (int j = 0; j < boxes.length; ++j) { // O(n)
        System.out.println(boxes[i] + " " + boxes[j]);
      }
    }

    // Big O (n * n) = O(n^2)
  }

}