import java.util.*;

class _01_arrays{
  public static void main(String[] args){
    // using List instead of array in Java in order to add/delete item using O(1). Arrays are fixed length in Java
    List<String> strings = new ArrayList<String>(Arrays.asList("a","b","c","d"));
    System.out.println(strings);
    // On 32-bit = 4*4 = 16 Bytes of storage

    System.out.println(strings.get(2));
    // Variable array is somewhere in memory and the computer knows it.
    // When I do array[2], i'm telling the computer, hey go to the array and grab the 3rd item from where the array is stored.

    // add to end of the array
    strings.add("e");
    // O(1)
    System.out.println(strings);

    // remove last item from the array
    strings.remove(strings.size() - 1);
    strings.remove(strings.size() - 1);
    // O(1)
    System.out.println(strings);

    // add items at the beginning of array
    strings.add(0, "x");
    // O(n)
    System.out.println(strings);

    // add item in the middle of the array
    strings.add(2, "alien");
    // O(n/2) = O(n)
    System.out.println(strings);    
  }
}