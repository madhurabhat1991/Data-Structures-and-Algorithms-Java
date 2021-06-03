import java.util.*;

class _01_hashTable_implementation {
  public static void main(String[] args) {
    HashTable myHash = new HashTable(50);
    myHash.set("grapes", 1200);
    myHash.set("apples", 9);
    System.out.println("grapes - " + myHash.get("grapes"));
    myHash.set("bananas", 45);
    System.out.println("apples - " + myHash.get("apples"));
    System.out.println("bananas - " + myHash.get("bananas"));
    System.out.println(Arrays.toString(myHash.keys().toArray()));
    myHash.set("mangoes", 23);
    System.out.println(Arrays.toString(myHash.keys().toArray()));
  }
}

public class HashTable {
  ArrayList<KeyValue>[] data;

  public HashTable(int size) {
    this.data = new ArrayList[size];
  }

  private int _hash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash + key.codePointAt(i) * i) % data.length;
    }
    return hash;
  }

  public void set(String key, int value) {
    int address = _hash(key);
    if (data[address] == null) {
      ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
      data[address] = arrayAtAddress;
    }
    KeyValue pair = new KeyValue(key, value);
    data[address].add(pair);

    KeyValue kvp = data[address].get(data[address].size() - 1);
    System.out.println(kvp.getKey() + " " + kvp.getValue());
  }

  public Integer get(String key) {
    int address = _hash(key);
    ArrayList<KeyValue> bucket = data[address];
    if (bucket != null) {
      for (KeyValue kvp : bucket) {
        if (kvp.getKey().equals(key)) {
          return kvp.getValue();
        }
      }
    }
    return null;
  }

  public List<String> keys() {
    List<String> keysArray = new ArrayList<String>();
    for (int i = 0; i < data.length; ++i) {
      if (data[i] != null) {
        ArrayList<KeyValue> bucket = data[i];
        for (KeyValue kvp : bucket) {
          keysArray.add(kvp.getKey());
        }
      }
    }
    return keysArray;
  }
}

public class KeyValue {
  private String key;
  private int value;

  public KeyValue(String key, int value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public int getValue() {
    return value;
  }
}