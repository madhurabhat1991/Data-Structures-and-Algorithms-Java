import java.util.*;

class _02_hashTables {
  public static void main(String[] args) {
    // HashTables
    Map<String, String> names = new Hashtable<String, String>();

    names.put("Albert", "Einstein");
    names.put("Marie", "Curie");
    names.put("Isaac", "Newton");
    names.put("Stephen", "Hawking");

    System.out.println(names);

    System.out.println("Marie " + names.get("Marie"));
    System.out.println("Isaac " + names.get("Isaac"));

    System.out.println("Remove Albert " + names.remove("Albert"));

    System.out.println(names);
    System.out.println();

    // HashMap
    Map<String, String> phones = new HashMap<String, String>();

    phones.put("Albert", "111-222-333");
    phones.put("Marie", "999-888-777");

    System.out.println(phones);

    System.out.println("Marie's phone " + phones.get("Marie"));

    System.out.println("Remove Albert's phone " + phones.remove("Albert"));

    System.out.println(phones);
    System.out.println();

    // HashSet
    Set<String> fullNames = new HashSet<String>();

    fullNames.add("Albert Einstein");
    fullNames.add("Marie Curie");

    System.out.println(fullNames);

    if (fullNames.contains("Marie Curie")) {
      System.out.println("Marie is present");
    }

    if (!fullNames.contains("Isaac Newton")) {
      System.out.println("Isaac is not present");
    }

    System.out.println("Remove Albert's full name " + fullNames.remove("Albert Einstein"));

    System.out.println(fullNames);
  }
}