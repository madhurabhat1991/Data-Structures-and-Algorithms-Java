class _07_boooo {
  public static void main(String[] args) {
    int[] n = new int[] { 1, 2, 3, 4, 5 };

    boooo(n);

    String[] hiArray = arrayOfHiNTimes(6);
    for (String each : hiArray) {
      System.out.println(each);
    }
  }

  public static void boooo(int[] n) {
    for (int i = 0; i < n.length; ++i) {
      System.out.println("boooo!");
    }

    // Time complexity = O(n)
    // Space complexity = O(1)
  }

  public static String[] arrayOfHiNTimes(int n) {
    String[] hiArray = new String[n];

    for (int i = 0; i < n; ++i) {
      hiArray[i] = "hi";
    }

    return hiArray;

    // Time complexity = O(n)
    // Space complexity = O(n)
  }

}