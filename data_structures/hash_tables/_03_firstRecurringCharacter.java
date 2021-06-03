//Google Question - given an array return first recurring character
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2

import java.util.HashSet;
import java.util.Set;

class _03_firstRecurringCharacter {
  public static void main(String[] args) {
    System.out.println(firstRecurringCharacter(new int[] {}));
    System.out.println(firstRecurringCharacter(new int[] { 2, 5, 1, 2, 3, 5, 1, 2, 4 }));
    System.out.println(firstRecurringCharacter(new int[] { 2, 1, 1, 2, 3, 5, 1, 2, 4 }));
    System.out.println(firstRecurringCharacter(new int[] { 2, 3, 4, 5 }));
    System.out.println(firstRecurringCharacter(new int[] { 2, 5, 5, 2, 3, 5, 1, 2, 4 }));

  }

  public static Integer firstRecurringCharacter(int[] input) {
    Set<Integer> rec = new HashSet<>();
    for (int in : input) {
      if (rec.contains(in)) {
        return in;
      }
      rec.add(in);
    }
    return null;

    // TC - O(n)
    // SC - O(n)
  }
}