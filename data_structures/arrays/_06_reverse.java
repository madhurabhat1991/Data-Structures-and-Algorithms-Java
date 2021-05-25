// create a function that reverse a string:
// example: "Hello World" becomes "dlroW olleH"

class _06_reverse{
  public static void main(String[] args){
    System.out.println(reverse(""));
    System.out.println(reverse(" "));
    System.out.println(reverse("H"));
    System.out.println(reverse("Hello"));
    System.out.println(reverse("Thank you"));

    System.out.println(reverse2("Thank you"));
    System.out.println(reverse2("Nice to meet you!"));
  }

  public static String reverse(String str){
    char[] chars = new char[str.length()];

    for (int i = 0; i < str.length(); ++i){
      chars[str.length() - i - 1] = str.charAt(i);
    }    

    return new String(chars);
  }

  public static String reverse2(String str){
    String out = "";

    for (int i = str.length() - 1; i >= 0; --i){
      out += str.charAt(i);
    }    

    return out;
  }
}