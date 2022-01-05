import java.util.*;

class _01_anatomy {
  public static void main(String[] args) {
    // stack_overflow();

    System.out.println(inception(0));
  }

  public static void stack_overflow(){
    stack_overflow();
  }

  /*** Anatomy of recursion
  1. Identify the base case
  2. Identify the recursive case
  3. Get closer and closer and return when needed. Usually you have 2 returns
  ***/

  public static String inception(int counter){
    if (counter > 3){           // return base case
      return "done!";
    }
    System.out.println(counter);
    counter++;
    return inception(counter);  // return recursion
  }
}