import java.util.*;

public class HashTable {
  public int[] data;

  public HashTable(int size) {
    data = new int[size];
  }

  public int get(Object index) {
    return data[index.hashCode() % data.length];
  }

  public void put(Object index, int value) {
    data[index.hashCode() % data.length] = value;
  }

  public static void main(String[] args) {
    HashTable ht = new HashTable(100);
    ht.put("test", 4);
    ht.put("test2", 10);

    System.out.println(ht.get("test"));
    System.out.println(ht.get("test2"));
  }
}
