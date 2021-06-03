class _02_printFirstItemThenFirstHalfThenSayHi100Times {
  public static void main(String[] args) {
    String[] items = new String[] { "a", "b", "c", "d", "e" };

    printFirstItemThenFirstHalfThenSayHi100Times(items);

    compressBoxesTwice(items);
  }

  public static void printFirstItemThenFirstHalfThenSayHi100Times(String[] items) {
    System.out.println(items[0]); // O(1)

    double middleIndex = Math.ceil((double) items.length / 2);
    int index = 0;

    while (index < middleIndex) { // O(n/2)
      System.out.println(items[index]);
      index++;
    }

    for (int i = 0; i < 10; ++i) { // O(10)
      System.out.println("Hi " + (i + 1));
    }

    // Big O (1 + n/2 + 10) = O(n)
  }

  public static void compressBoxesTwice(String[] boxes) {
    for (String box : boxes) { // O(n)
      System.out.println(box);
    }

    for (String box : boxes) { // O(n)
      System.out.println(box);
    }

    // Big O (2n) = O(n)
  }

}