class _06_factorial {
  public static void main(String[] args) {
    int n = 10;

    factorial(n);
  }

  public static void factorial(int n) {
    for (int i = 0; i < n; ++i) {
      System.out.println(n);
      factorial(n - 1);
    }

    // O(n!)
  }

}