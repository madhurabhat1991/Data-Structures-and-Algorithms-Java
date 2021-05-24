import java.util.*;

class _02_reference_type{
  public static void main(String[] args){
    Map<String, Object> object1 = new HashMap<>();
    object1.put("value", 10);
    System.out.println("object1 " + object1);

    Map<String, Object> object2 = object1;
    System.out.println("object2 " + object2);

    Map<String, Object> object3 = new HashMap<>();
    object3.put("value", 10);
    System.out.println("object3 " + object3);

    System.out.println(object1 == object2);

    System.out.println(object1 == object3);

    object1.put("value", 15);
    System.out.println("object1 " + object1);
    System.out.println("object2 " + object2);
    System.out.println("object3 " + object3);
  }
}