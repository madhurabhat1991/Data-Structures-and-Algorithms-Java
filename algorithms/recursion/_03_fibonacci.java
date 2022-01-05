// Given a number N return the index value of the Fibonacci sequence,
// where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values,
// that means that for N=5 → 2+3
// For example: fibonacciRecursive(6) should return 8

import java.util.*;

class _03_fibonacci {
  public static void main(String[] args) {
    int n = 6;
    System.out.println(fibonacciRecursive(n));
    System.out.println(fibonacciIterative(n));
  }

  public static int fibonacciRecursive(int n) {
    if (n < 2) {
      return n;
    }
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    // TC - O(2^n)
  }

  public static int fibonacciIterative(int n) {
    if (n < 2) {
      return n;
    }
    int counter = 2;
    int number1 = 0;
    int number2 = 1;
    int current = 0;
    while (counter <= n) {
      current = number1 + number2;
      number1 = number2;
      number2 = current;
      counter++;
    }
    return current;

    // TC - O(n)
  }
}