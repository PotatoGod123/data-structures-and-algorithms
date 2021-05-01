package code.hashtabletest;

import code.hashtable.HashTable;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashTableTest {
  @Test
  public void testingHashTable(){
    HashTable newHashTable = new HashTable(6);

    newHashTable.add("epic","not cool");
    newHashTable.add(1,323);
    newHashTable.add("cooler","coolest");

    System.out.println(newHashTable.get("epic"));

    System.out.println(newHashTable.contains("epic"));

    assertTrue("Must be true",newHashTable.contains("epic"));
    assertFalse(newHashTable.contains(2));

    System.out.println(newHashTable);
  }

}
