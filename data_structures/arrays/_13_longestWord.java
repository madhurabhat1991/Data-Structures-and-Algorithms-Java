
// https://www.coderbyte.com/language/Longest%20Word

import java.util.*;

class _13_longestWord {
  public static void main(String[] args) {
    System.out.println(LongestWord("Hello2!3 world"));
    System.out.println(LongestWord("fun&!! time"));
    System.out.println(LongestWord("I love dogs"));
    System.out.println(LongestWord("Hello world123 567"));

  }

  public static String LongestWord(String sen) {
    String[] words = sen.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
    int maxLength = 0;

    for (String word : words) {
      if (word.length() > maxLength) {
        maxLength = word.length();
        sen = word;
      }
    }
    return sen;
  }
}