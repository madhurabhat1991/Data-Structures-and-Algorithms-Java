class _05_printAllNumbersThenAllPairSums{
  public static void main(String[] args){
    int[] numbers = new int[] {1,2,3,4,5};

    printAllNumbersThenAllPairSums(numbers);
  }

  public static void printAllNumbersThenAllPairSums(int[] numbers){
    System.out.println("These are the numbers");
    for (int number : numbers){ // O(n)
      System.out.println(number);
    }

    System.out.println("These are their sums");
    for (int number1 : numbers){  // O(n)
      for (int number2 : numbers){  // O(n)
        System.out.println(number1 + number2);
      }
    }

    // Big O (n + n^2) = O(n^2)
  }

}