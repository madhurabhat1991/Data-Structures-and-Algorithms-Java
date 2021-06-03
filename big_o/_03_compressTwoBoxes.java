class _03_compressTwoBoxes {
  public static void main(String[] args) {
    String[] boxes1 = new String[] { "a", "b", "c", "d", "e" };
    String[] boxes2 = new String[] { "u", "v", "w", "x", "y", "z" };

    compressTwoBoxes(boxes1, boxes2);
  }

  public static void compressTwoBoxes(String[] boxes1, String[] boxes2) {
    for (String box : boxes1) { // O(a)
      System.out.println(box);
    }

    for (String box : boxes2) { // O(b)
      System.out.println(box);
    }

    // Big O (a + b) = O(a + b)
  }

}